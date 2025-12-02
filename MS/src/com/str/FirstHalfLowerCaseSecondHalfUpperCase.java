package com.str;

public class FirstHalfLowerCaseSecondHalfUpperCase {
    static void main() {
        String str = "Satish";
        System.out.println(convertStr(str));
    }

    private static String convertStr(String str) {
        int mid = str.length()/2;

        String firstHalf = str.substring(0, mid).toLowerCase();
        String secondHalf = str.substring(mid).toUpperCase();

        return firstHalf+ secondHalf;
    }
}
