package com.jdk17.payment;

public record NetBanking(String bank, double amount) implements Payment{
}
