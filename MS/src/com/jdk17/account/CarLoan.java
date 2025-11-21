package com.jdk17.account;

public final class CarLoan extends LoanAccount{
    @Override
    public void accountType() {
        System.out.println("Car Loan");
    }
}
