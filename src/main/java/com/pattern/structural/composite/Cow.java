package com.pattern.structural.composite;

public class Cow implements Animal {

    @Override
    public double getWeightKG() {
        return 725.00;
    }

    @Override
    public void speak() {
        System.out.println("Moo");
    }

    @Override
    public void eat() {
        System.out.println("Eatten");
    }

    @Override
    public void sleep(int hours) {
        System.out.println("Sleep Mode for: " + hours);
    }

    @Override
    public void breathe() {
        System.out.println("Give me Air");
    }
}
