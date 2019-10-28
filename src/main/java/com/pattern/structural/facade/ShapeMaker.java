package com.pattern.structural.facade;

public class ShapeMaker {

    private Shape circle;
    private Shape square;

    public ShapeMaker()
    {
        circle = new Circle();
        square = new Square();
    }

    public void makeCircle(){
        circle.assemble();
    }

    public void makeSquare(){
        square.assemble();
    }
}
