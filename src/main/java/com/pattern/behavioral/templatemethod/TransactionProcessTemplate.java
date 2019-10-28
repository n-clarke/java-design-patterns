package com.pattern.behavioral.templatemethod;

public abstract class TransactionProcessTemplate {

    //Default Constructor
    {
        productSelected();

        System.out.println("Transaction Method: ");
        paymentTransaction();

        System.out.println("Delivery: ");
        productDelivery();

        System.out.println("Transaction Id: ");
    }

    public abstract void productSelected();

    public abstract void paymentTransaction();

    public abstract void productDelivery();
}
