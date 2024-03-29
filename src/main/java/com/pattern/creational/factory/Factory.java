package com.pattern.creational.factory;

public class Factory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("Apple MacBook Pro".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
