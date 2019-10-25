package src.main.java.com.pattern.creational.abstractfactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.newComputer();
    }

}
