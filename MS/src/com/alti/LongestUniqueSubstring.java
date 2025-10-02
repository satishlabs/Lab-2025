package com.alti;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String input2 = "bbbbb";
        String input3 = "pwwkew";

        System.out.println("Input1: "+input1+" - Length: "+lengthOfLongestSubString(input1));
        System.out.println("Input2: "+input1+" - Length: "+lengthOfLongestSubString(input2));
        System.out.println("Input3: "+input1+" - Length: "+lengthOfLongestSubString(input3));

    }

    private static int lengthOfLongestSubString(String input) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int right=0; right<input.length(); right++){
            char c = input.charAt(right);

            while(set.contains(c)){
                set.remove(input.charAt(left));
                left++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
