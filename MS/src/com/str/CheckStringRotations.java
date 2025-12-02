package com.str;

public class CheckStringRotations {
    static void main() {
        String str1 = "abcde";
        String str2 = "abced";

        System.out.println(rotationString(str1, str2));
    }

    private static boolean rotationString(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        String temp = str1+str1;

        return temp.contains(str2);
    }
}
