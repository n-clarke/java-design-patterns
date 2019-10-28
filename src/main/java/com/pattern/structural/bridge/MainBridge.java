package com.pattern.structural.bridge;

public class MainBridge {

    public static void main(String[] Args)
    {
        Animal blackDog = new Dog(new ColorBlack());
        blackDog.setColor();

        Animal brownCat = new Cat(new ColorBrown());
        brownCat.setColor();
    }
}
