package com.pattern.creational.factory;

public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM = " + this.getRAM() + "\n HDD = " + this.getHDD() + "\n CPU = " + this.getCPU();
    }
}