package com.techbuddy.solid.isp.problem;

//Let's understand that most of the implementation of UPIPayments doesn't support all the given functionality.
//providing couple of the implementations
public interface UPIPayments {
    void payMoney();
    void getScratchCard();
    void getCashBackAsCreditBalance();
}
