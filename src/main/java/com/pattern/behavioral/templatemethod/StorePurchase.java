package com.pattern.behavioral.templatemethod;

class StorePurchase extends TransactionProcessTemplate {
    @Override
    public final void productSelected() {
        System.out.println("Customer has taken an item from a shelf.");
    }

    @Override
    public final void paymentTransaction() {
        System.out.println("Customer has paid at counter using either Cash, POS or Gift Card.");
    }

    @Override
    public final void productDelivery() {
        System.out.println("Product has been collected at store counter.");
    }
}
