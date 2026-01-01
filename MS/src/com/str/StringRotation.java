package com.str;

public class StringRotation {
    static void main() {
        String str1 = "abcd";
        String str2 = "cdab";
        System.out.println(isRotation(str1, str2));
    }

    private static boolean isRotation(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        return (str1+str1).contains(str2);
    }
}
