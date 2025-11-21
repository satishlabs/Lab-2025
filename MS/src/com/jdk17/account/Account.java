package com.jdk17.account;

public sealed class Account permits  SavingsAccount, LoanAccount, DigitalAccount {
    public void accountType(){
        System.out.println("General Account");
    }
}
