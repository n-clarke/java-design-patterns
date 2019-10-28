package com.pattern.structural.decorator;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of a Blue Shape.");
    }
}
