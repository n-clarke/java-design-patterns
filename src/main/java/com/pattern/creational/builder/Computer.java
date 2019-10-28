package com.pattern.creational.builder;

public class Computer {

    private String hdd, ram;
    private boolean isGraphicsCardEnabled, isBluetoothEnabled;

    public String getHDD() { return hdd; }
    public String getRAM() { return ram; }

    public boolean isGraphicsCardEnabled() { return isGraphicsCardEnabled; }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled; }

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString(){
        return "\nRAM = " + this.getRAM() + "\nHDD = " + this.getHDD() + "\nHas Graphics Card = " + isGraphicsCardEnabled() + "\nHas Bluetooth = " + isBluetoothEnabled();
    }

    //Computer Builder Class
    public static class ComputerBuilder{

        private String hdd, ram;
        private boolean isGraphicsCardEnabled, isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram){
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
