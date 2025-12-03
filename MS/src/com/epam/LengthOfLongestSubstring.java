package com.epam;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    static void main() {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        int startIndex = 0; //to remember where longest subString starts
        //"abcabcbb"
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            //shrink window if duplicates found
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);

            //update max if this window is bigger
            if( i-left+1> maxLen){
                maxLen = i-left+1;
                startIndex = left;  // store starting index of longest substring
            }
        }
        String longest = s.substring(startIndex, startIndex+maxLen);
        System.out.println("Longest subString without repeat: "+longest);
        return maxLen;
    }
}
