package com.pattern.behavioral.templatemethod;

public class MainTemplateMethod {

    public static void main(String[] args)
    {
        TransactionProcessTemplate onlineOrder = new OnlinePurchase();
        System.out.println(onlineOrder + "\n");

        TransactionProcessTemplate storePurchase = new StorePurchase();
        System.out.println(storePurchase + "\n");
    }
}
