package com.pattern.structural.bridge;

public class Cat extends Animal {

    public Cat (ColorBrown animal) {
        super(animal);
    }

    @Override
    public void setColor() {
        System.out.print("Cat had a colour.");
        color.setColor();
    }
}
