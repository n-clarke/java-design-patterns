package com.pattern.structural.decorator;

public class MainDecorator {

    public static void main(String[] args)
    {
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.assemble();

        System.out.println("\n");

        Shape blueSquare = new BlueShapeDecorator(new Square());
        blueSquare.assemble();
    }
}
