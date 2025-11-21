package com.jdk17.payment;

public class TestPayment {
    public static void main() {
        Payment p1 = new CardPayment("1111-2222-3333", 500);
        System.out.println(p1);
        p1 = new UpiPayment("test@upi", 12000);
        System.out.println(p1);

        p1 = new NetBanking("HDFC", 9000);
        System.out.println(p1);

        p1 = new COD(3000);
        System.out.println(p1);
    }
}
