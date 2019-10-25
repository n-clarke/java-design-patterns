package src.main.java.com.pattern.structural.composite;

public class Chicken implements Animal {

    @Override
    public double getWeightKG() {
        return 2.2;
    }

    @Override
    public void speak() {
        System.out.println("Chrup");
    }

    @Override
    public void eat() {
        System.out.println("Eatten");
    }

    @Override
    public void sleep(int hours) {
        System.out.println("Sleep Mode for: " + hours + "hours");
    }

    @Override
    public void breathe() {
        System.out.println("Give me Air");
    }
}
