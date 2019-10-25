package src.main.java.com.pattern.creational.abstractfactory;

public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "\nRAM = " + this.getRAM() + "\nHDD = " + this.getHDD() + "\nCPU = " + this.getCPU();
    }
}