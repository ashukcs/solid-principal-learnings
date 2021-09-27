package com.techbuddy.solid.srp.solution;

// This service will tackle only loan related things or you can say we have only reason (loan related) to change it.
public class LoanService {
    public void getLoan(String loanType){
        switch(loanType) {
            case "HomeLoan":
                //perform logic for home loan
            case "CarLoan":
                //perform logic for car loan
            default:
                //Perform default logic
        }
    }
}
