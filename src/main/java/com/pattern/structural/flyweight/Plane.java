package com.pattern.structural.flyweight;

import java.awt.*;

public class Plane implements Vehicle {

    private Engine engine;
    private Color color;

    public Plane(Engine engine, Color color)
    {
        this.engine = engine;
        this.color = color;

        try {
            Thread.sleep(2000);
            System.out.println("Plane has been created.");
        } catch (InterruptedException e) {
            System.out.println("Error while creating a new car" + e);
        }
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void start() {
        engine.start();
        System.out.println("Plane Has Started.");
    }

    @Override
    public void stop() {
        engine.stop();
        System.out.println("Plane Has Stopped.");
    }
}
