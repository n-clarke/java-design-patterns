package com.pattern.structural.composite;

public class Pig implements Animal {

    @Override
    public double getWeightKG() {
        return 118.00;
    }

    @Override
    public void speak() {
        System.out.println("Oink");
    }

    @Override
    public void eat() {
        System.out.println("Eatten");
    }

    @Override
    public void sleep(int hours) {
        System.out.println("Sleep Mode for: " + hours + "hours");
    }

    @Override
    public void breathe() {
        System.out.println("Give me Air");
    }
}

