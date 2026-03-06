package com.cba;

public class User {
    String user;
    double amount;

    public User(){}

    public User(String user, double amount) {
        this.user = user;
        this.amount = amount;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "user=" + user +
                ", amount=" + amount +
                '}';
    }
}
