package src.main.java.com.pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionDestroySingleton {
    public static void main(String[] args) {
        Eager instanceOne = Eager.getInstance();
        Eager instanceTwo = null;

        try {
            Constructor[] constructors = Eager.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (Eager) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
