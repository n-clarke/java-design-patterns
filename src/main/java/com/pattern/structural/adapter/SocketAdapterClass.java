package com.pattern.structural.adapter;

public class SocketAdapterClass extends Socket implements Adapter {

    public Volt get80Volt() {
        return getVolt();
    }

    public Volt get50Volt() {
        Volt v = getVolt();
        return convertVolt(v,10);
    }

    public Volt get15Volt() {
        Volt v = getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts()/i);
    }
}
