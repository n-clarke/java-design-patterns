package com.pattern.behavioral.templatemethod;

class StorePurchase extends TransactionProcessTemplate
{

    @Override
    public void productSelected()
    {
        System.out.println("Customer has taken an item from a shelf.");
    }

    @Override
    public void paymentTransaction()
    {
        System.out.println("Customer has paid at counter using either cash, POS or gift card.");
    }

    @Override
    public void productDelivery()
    {
        System.out.println("Product is collected at store counter.");
    }
}
