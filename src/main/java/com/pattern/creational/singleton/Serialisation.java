package com.pattern.creational.singleton;

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
        Serialisation serialOne = Serialisation.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
        out.writeObject(serialOne);
        out.close();

        //Deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
        Serialisation serialTwo = (Serialisation) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode = " + serialOne.hashCode());
        System.out.println("instanceTwo hashCode = " + serialTwo.hashCode());
        
        new File("file.txt").delete();
    }
}
