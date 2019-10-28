package com.pattern.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    //Store the existing vehicles
    private static Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    //Private class to prevent the class from being instantiation.
    private VehicleFactory() {}

    public static Vehicle createVehicle(Color color) {
        // Checks if the vehicle exists. If the vehicle doesn't exist, a new one is created.
        Vehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor -> {
            Engine newEngine = new Engine();
            return new Plane(newEngine, newColor);
        });
        return newVehicle;
    }

    public static void main(String[] args) {
        VehicleFactory vf = new VehicleFactory();

        vf.createVehicle(Color.blue);
        vf.createVehicle(Color.red);

        for (Map.Entry<Color, Vehicle> entry : vehiclesCache.entrySet()) {
            System.out.println("Vehicle Id : " + entry.getValue() + ", Color : " + entry.getKey());
        }
    }
}
