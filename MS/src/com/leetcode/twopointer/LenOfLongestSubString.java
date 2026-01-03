package com.leetcode.twopointer;

import java.util.HashSet;
import java.util.Set;

public class LenOfLongestSubString {
    static void main() {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }

    private static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left  =0;
        int maxLen = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            while(set.contains(ch)){
                set.remove(s.charAt(i));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}
