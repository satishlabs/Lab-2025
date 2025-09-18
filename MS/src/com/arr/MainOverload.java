package com.arr;

public class MainOverload {
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main(10);
        main("Satish");
    }
    // Overloaded main methods
    public static void main(int x) {
        System.out.println("Main method with int: " + x);
    }

    public static void main(String str) {
        System.out.println("Main method with String: " + str);
    }

}
