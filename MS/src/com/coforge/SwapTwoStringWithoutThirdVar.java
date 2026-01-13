package com.coforge;

public class SwapTwoStringWithoutThirdVar {
    static void main() {
        String s1 = "Java";
        String s2 = "Software";
        System.out.println("\n==========Before Swapping===================");
        System.out.println(s1+" "+s2);
        System.out.println("\n==========After Swapping===================");

        s1 = s1+s2;
        s2 = s1.substring(0, (s1.length() - s2.length()));
        s1 = s1.substring(s2.length());

        System.out.println(s1+" "+s2);

    }
}
