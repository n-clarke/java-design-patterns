package src.main.java.com.pattern.creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

    private String ram, hdd, cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer newComputer() {
        return new Server(ram,hdd,cpu);
    }
}