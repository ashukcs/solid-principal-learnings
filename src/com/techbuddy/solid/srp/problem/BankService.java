package com.techbuddy.solid.srp.problem;

public class BankService {
    /*
    *   Let's say, BankService is responsible to perform few operations as
    *   1- withdrawal from bank
    *   2- deposit into bank
    *   3- get loan (credit card loan, home loan, car load, education loan etc...)
    *   4- print passbook
    *   5- send notification
    *   Note - Have you identified, this class has multiple reason to change
    * */

    public long withDraw(long amount, long accountNumber){
        // withdrawal
        return 0;
    }

    public long deposit(long amount, long accountNumber){
        //deposit
        return 0;
    }

    public void printPassbook(long accountNumber){
        //print passbook
    }

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

    public long sendNotification(String medium){
        switch(medium) {
            case "email":
                //send notification to email
                return 0;
            case "mobile":
                //send notification to mobile
                return 0;
            default:
                //Perform default logic
                return 0;
        }
    }
}
