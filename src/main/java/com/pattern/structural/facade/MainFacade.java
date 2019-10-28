package com.pattern.structural.facade;

public class MainFacade {

    public static void main(String[] args)
    {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.makeCircle();
        shapeMaker.makeSquare();
    }
}
