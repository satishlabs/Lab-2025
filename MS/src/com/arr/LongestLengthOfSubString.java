package com.arr;

import java.util.HashMap;
import java.util.Map;

public class LongestLengthOfSubString {
    static void main() {
        String str = "abcabcbb";
        System.out.println(longestLengthOfSubString(str));
    }

    private static int longestLengthOfSubString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch)+1);
            }

            map.put(ch, i);
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}
