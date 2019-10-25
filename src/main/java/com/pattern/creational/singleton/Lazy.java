package src.main.java.com.pattern.creational.singleton;

public class Lazy {
    private static Lazy instance;

    private Lazy(){}

    public static Lazy getInstance(){
        if(instance == null){
            instance = new Lazy();
        }
        return instance;
    }
}
