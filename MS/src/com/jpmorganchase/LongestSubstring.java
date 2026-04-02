package com.jpmorganchase;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    static void main(String[] args) {
        //String str = "abcdefabcbb";
        System.out.println(longestSubstring("aaa"));
        System.out.println("\n=======================");
        System.out.println(longestSubstring("abcdefabcbb"));

    }

    private static int longestSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxlength = 0;
        for(int i=0; i<str.length(); i++){
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(i));
                left++;
            }
            set.add(str.charAt(i));
            maxlength = Math.max(maxlength, i-left+1);
        }
        return maxlength;
    }
}
