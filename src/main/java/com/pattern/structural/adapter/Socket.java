package src.main.java.com.pattern.structural.adapter;

public class Socket {

    public Volt getVolt(){
        return new Volt(80);
    }
}
