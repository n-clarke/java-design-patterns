package com.pattern.structural.decorator;

public class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void assemble() {
        this.shape.assemble();
    }
}
