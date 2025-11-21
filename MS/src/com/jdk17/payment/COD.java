package com.jdk17.payment;

public non-sealed class COD implements Payment{
    public double amount;

    public COD(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "COD{" +
                "amount=" + amount +
                '}';
    }
}
