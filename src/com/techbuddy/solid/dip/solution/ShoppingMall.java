package com.techbuddy.solid.dip.solution;

public class ShoppingMall {
    private BankCard bankCard;

    ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void doPayment(Object order, int amount){
        System.out.println("Order placed with order - " + order.toString());
        bankCard.doTransaction(amount);
    }

    //only change required if you will change the payment method
    public static void main(String[] args) {
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPayment("t-shirt, jeans, shoes", 12000);
    }
}
