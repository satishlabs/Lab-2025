package com.jdk17.account;

public sealed class LoanAccount extends Account permits HomeLoan, CarLoan{
    @Override
    public void accountType() {
        System.out.println("Loan Account");
    }
}
