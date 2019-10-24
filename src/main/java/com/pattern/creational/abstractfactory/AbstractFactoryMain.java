package com.pattern.creational.abstractfactory;

import static com.pattern.creational.abstractfactory.ComputerFactory.getComputer;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        Computer pc = getComputer(new PCFactory("8 GB","1 TB","2.4 GHz"));
        Computer server = getComputer(new ServerFactory("32 GB","3 TB","5 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
