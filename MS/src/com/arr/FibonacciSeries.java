package com.arr;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        for(int i=1; i<=n; i++){
            System.out.print(a+", ");
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println("\n====================");
        for(int i=0; i<n; i++){
            System.out.print(fibo(i)+" ");
        }
    }

    private static int fibo(int n) {
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
