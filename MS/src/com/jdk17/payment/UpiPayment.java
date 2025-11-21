package com.jdk17.payment;

public record UpiPayment(String upiId, double amount) implements Payment {
}
