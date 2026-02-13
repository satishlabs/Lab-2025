package com.htc;

public class PrimeNumber {

    public static void main(String[] args) {

        int n = 10;
        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        int num = 29;
        if (isPrime(num))
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }

    // Method to check prime
    public static boolean isPrime(int num) {

        if (num <= 1) return false;

        for (int i = 2; i <= num/i; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
