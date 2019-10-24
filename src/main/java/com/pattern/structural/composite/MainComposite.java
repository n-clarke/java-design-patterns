package com.pattern.structural.composite;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MainComposite {

    public static ArrayList<Animal> farm = new ArrayList<Animal>();

    public static void main(String[] Args)
    {
        farm.add(new Pig());
        farm.add(new Cow());
        farm.add(new Chicken());
        farm.add(new Sheep());

        //Print Animals Smaller than 75kg
        System.out.println("Animals Smaller Than 75 KG");
        farm.stream()
                .filter(m->m.getWeightKG() <= 75)
                .forEach(System.out::println);

        //Print Animal Greater than 30kg
        System.out.println("Animals > 30 KG");
        farm.stream()
                .filter(m->m.getWeightKG() > 30)
                .forEach(System.out::println);

        //Make Animals Greater than 30kg Speak
        Stream<Animal> heavy =
            farm.stream()
                    //.map(a->{a.speak(); return a;})
                    .filter(a -> a.getWeightKG() > 30);
        System.out.println("Make Big Animals Speak:");
        heavy.forEach(Animal::speak);
    }
}
