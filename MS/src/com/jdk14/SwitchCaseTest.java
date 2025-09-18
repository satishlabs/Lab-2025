package com.jdk14;

import java.net.DatagramSocket;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Days day = Days.Tuesday;
        switch (day){
            case Monday:
            case Tuesday:
            case Wednesday:
                System.out.println(6);
                break;
            case Thursday:
                break;
            case Saturday:
            case Friday:
                System.out.println("Its a weekday");
                break;
            case Sunday:
                System.out.println("Its a weekend");
                break;
            default:
                System.out.println("Unkown day");
        }
    }
}
