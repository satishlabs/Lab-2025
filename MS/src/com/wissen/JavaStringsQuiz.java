package com.wissen;

public class JavaStringsQuiz {
    public static void main(String[] args)
    {
        String str1 = new String("Java");

        String str2 = new String("Java");

        String str3 = "Java";

        String str4 = "Java";

        System.out.println(str1 == str2); //false
        System.out.println(str3 == str4); //true
        System.out.println(str1 == str3); //false
    }
}
