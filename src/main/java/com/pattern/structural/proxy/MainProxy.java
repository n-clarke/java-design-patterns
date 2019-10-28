package com.pattern.structural.proxy;

public class MainProxy {

    public static void main(String[] args){

        CommandExecutor executor = new CommandExecutorProxy("Admin", "Invalid");
        try {
            executor.runCommand(" pwd");
            executor.runCommand(" rm -rf test.pdf");
        } catch (Exception e) {
            System.out.println("Exception::" + e.getMessage());
        }
    }
}
