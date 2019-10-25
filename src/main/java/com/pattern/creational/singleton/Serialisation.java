package src.main.java.com.pattern.creational.singleton;

import java.io.*;

public class Serialisation implements Serializable {

    private static final long serialVersionUID = 42L;

    private Serialisation(){}

    private static class SingletonHelper{
        private static final Serialisation instance = new Serialisation();
    }

    public static Serialisation getInstance(){
        return SingletonHelper.instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialisation object to file
        Serialisation serialOne = Serialisation.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.ser"));
        out.writeObject(serialOne);
        out.close();

        //Deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.ser"));
        Serialisation serialTwo = (Serialisation) in.readObject();
        in.close();

        //Display hashcode
        System.out.println("instanceOne hashCode = " + serialOne.hashCode());
        System.out.println("instanceTwo hashCode = " + serialTwo.hashCode());

        //Clean up
        new File("file.ser").delete();
    }
}