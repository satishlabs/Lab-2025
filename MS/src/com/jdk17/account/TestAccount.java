package com.jdk17.account;

public class TestAccount {
    static void main() {
        Account a1 = new SavingsAccount();
        a1.accountType();
        a1 = new LoanAccount();
        a1.accountType();
        a1 = new DigitalAccount();
        a1.accountType();

        LoanAccount la = new CarLoan();
        la.accountType();
        la = new HomeLoan();
        la.accountType();
    }
}
