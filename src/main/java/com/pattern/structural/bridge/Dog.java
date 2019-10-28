package com.pattern.structural.bridge;

public class Dog extends Animal {

    public Dog(ColorBlack animal) {
        super(animal);
    }

    @Override
    public void setColor() {
        System.out.print("Dog has a color. ");
        color.setColor();
    }
}
