package com.pattern.creational.singleton;

public class StaticBlock {
    private static StaticBlock instance;

    private StaticBlock(){}

    //static block initialisation for exception handling
    static {
        try {
            instance = new StaticBlock ();
        }catch(Exception e){
            throw new RuntimeException("An Exception occurred in creating singleton instance");
        }
    }
}
