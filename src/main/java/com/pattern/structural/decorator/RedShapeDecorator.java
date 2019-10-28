package com.pattern.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of a Red Shape.");
    }
}
