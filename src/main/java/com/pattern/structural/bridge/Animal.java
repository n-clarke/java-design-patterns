package com.pattern.structural.bridge;

public abstract class Animal {

    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Animal(Color color){
        this.color = color;
    }

    abstract public void setColor();
}
