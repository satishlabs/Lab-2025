package com.jdk17.payment;

public sealed interface Payment permits  CardPayment, UpiPayment, NetBanking, COD {
}
