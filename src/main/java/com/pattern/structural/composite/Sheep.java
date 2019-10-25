package src.main.java.com.pattern.structural.composite;

public class Sheep implements Animal {

    @Override
    public double getWeightKG() {
        return 55.55;
    }

    @Override
    public void speak() {
        System.out.println("BAAAAA!!!!");
    }

    @Override
    public void eat() {
        System.out.println("Eatten");
    }

    @Override
    public void sleep(int hours) {
        System.out.println("Sleep Mode for: " + hours);
    }

    @Override
    public void breathe() {
        System.out.println("Give me Air");
    }
}
