package com.str;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
        String s3 = "Hi";
        String s4 = new String("Hi").intern();
        System.out.println(s3 == s4);
    }
    }
