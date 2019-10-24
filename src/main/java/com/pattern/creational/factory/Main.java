package com.pattern.creational.factory;

public class Main {

    public static void main(String[] args) {
        Computer pc = Factory.getComputer("Apple MacBook Pro","8 GB","1 TB","2.4 GHz");
        Computer server = Factory.getComputer("Server","32 GB","3 TB","5 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
