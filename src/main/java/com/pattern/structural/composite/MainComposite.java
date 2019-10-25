package src.main.java.com.pattern.structural.composite;

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

        //Animals Greater than 30kg
        Stream<Animal> heavy =
                farm.stream()
                        //.map(a->{a.speak(); return a;})
                        .filter(a -> a.getWeightKG() > 30);

        //Make Animals Greater than 30kg Speak
        System.out.println("Make Big Animals Speak:");
        heavy.forEach(Animal::speak);
    }
}
