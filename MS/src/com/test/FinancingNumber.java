package com.test;

public class FinancingNumber {
    static void main(String[] args) {
        int n=5;
        System.out.println( factNum(n));
    }

    private static int factNum(int n) {
        if(n==0 || n== 1)
            return 1;
        return n*factNum(n-1);
    }
}
