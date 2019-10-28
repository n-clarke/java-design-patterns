package com.pattern.behavioral.templatemethod;

class OnlinePurchase extends TransactionProcessTemplate
{
    @Override
    public void productSelected()
    {
        System.out.println("Product added to online shopping cart.");
    }

    @Override
    public void paymentTransaction()
    {
        System.out.println("Online Payment through Visa Debt, Credit Card or PayPal.");
    }

    @Override
    public void productDelivery()
    {
        System.out.println("Product is shipped through post to customers delivery address.");
    }
}
