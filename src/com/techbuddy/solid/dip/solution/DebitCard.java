package com.techbuddy.solid.dip.solution;

public class DebitCard implements BankCard{
    public void doTransaction(int amount){
        System.out.println("tx done with DebitCard");
    }
}