package com.techbuddy.solid.dip.problem;

// Here an example of dependency inversion principal
//As you can see ShoppingMall class completely dependent with debitcard,
// if we are looking to do payment then we required to perform lots of changes
// in the code to make it flexible for credit card payment
public class ShoppingMall {
    //change required here
    private DebitCard debitCard;

    //change required here
    public ShoppingMall(DebitCard debitCard){
        this.debitCard = debitCard;
    }

    public void doPayment(Object order, int amount){
        System.out.println("Order placed with items - " + order.toString());
        debitCard.doTransaction(amount);
    }
    //change required here
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);

        shoppingMall.doPayment("Order Details", 5000);
    }
}
