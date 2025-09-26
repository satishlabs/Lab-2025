package com.ip;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfTwoNaturalsNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first natural number: ");
        BigInteger num1 = sc.nextBigInteger();

        System.out.println("Enter second natural number: ");
        BigInteger num2 = sc.nextBigInteger();

        BigInteger sum =  num1.add(num2);
        System.out.println("The sum is: "+sum);
    }
}
