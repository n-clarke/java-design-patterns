package src.main.java.com.pattern.creational.builder;

public class MainBuilder {

    public static void main(String[] args)
    {
        Computer computer = new Computer.ComputerBuilder(
                "500 GB", "8 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        System.out.println(computer);
     }

}
