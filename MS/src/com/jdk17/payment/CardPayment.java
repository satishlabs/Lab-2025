package com.jdk17.payment;

public record CardPayment(String cardNo, double amount) implements Payment {
}
