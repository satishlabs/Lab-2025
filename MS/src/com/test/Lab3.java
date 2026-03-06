package com.test;

public class Lab3 {
    static void main(String[] args) {
        String s= "Java";
        System.out.println(s.charAt(0));
        //System.out.println(s.charAt(100)); //StringIndexOutOfBoundException

        String s2 = "Java";
        s2= s2.concat(" is");
        System.out.println(s2);
        s2 = s2+" easy";
        System.out.println(s2);
    }
}
