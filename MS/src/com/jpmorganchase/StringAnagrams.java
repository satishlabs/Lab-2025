package com.jpmorganchase;

import java.util.Arrays;

public class StringAnagrams {
    static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        //"Listen", "Silent"
        System.out.println(isAnagrams(str1,str2));
    }

    private static boolean isAnagrams(String str1, String str2) {
        char[] chr1 = str1.toLowerCase().toCharArray();
        char[] chr2 = str2.toLowerCase().toCharArray();

        if(chr1.length != chr2.length)
            return false;

        Arrays.sort(chr1);
        Arrays.sort(chr2);

        return Arrays.equals(chr1,chr2);
    }
}
