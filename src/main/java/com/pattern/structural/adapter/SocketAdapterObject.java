package com.pattern.structural.adapter;

public class SocketAdapterObject implements Adapter {

    //Using Composition for adapter pattern
    private Socket socket = new Socket();

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

    public Volt get80Volt() {
        return socket.getVolt();
    }

    public Volt get50Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v,10);
    }

    public Volt get15Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v,40);
    }
}
