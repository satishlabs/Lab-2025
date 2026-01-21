package com.str;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}
