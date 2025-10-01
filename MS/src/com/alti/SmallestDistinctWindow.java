package com.alti;

import java.util.HashMap;
import java.util.HashSet;

/*
- Given a string, find the smallest window length that contains all the characters of the string at least once.
 Example:
 Input: "aabcbdecdbca" → Output: 4 (Substring: "dbca")
 Input: "aaab" → Output: 2 (Substring: "ab")
* */
public class SmallestDistinctWindow {
    public static void main(String[] args) {
        String str1 = "aabcbdecdbca";
        String str2 = "aaab";
        System.out.println("Input: "+str1+" -> Output: "+findSmallestWindow(str1));
        System.out.println("Input: "+str2+" -> Output: "+findSmallestWindow(str2));
    }

    public static int findSmallestWindow(String str) {
        // Step 1: Find number of distinct characters
        HashSet<Character> distinctChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            distinctChars.add(c);
        }
        int required = distinctChars.size();

        // Step 2: Sliding Window
        HashMap<Character, Integer> windowFreq = new HashMap<>();
        int left = 0, minLen = Integer.MAX_VALUE;
        int count = 0; // how many unique chars matched in current window

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

            if (windowFreq.get(c) == 1) { // first time this char added
                count++;
            }

            // When window contains all unique chars → shrink from left
            while (count == required) {
                minLen = Math.min(minLen, right - left + 1);

                // shrink
                char leftChar = str.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                if (windowFreq.get(leftChar) == 0) {
                    count--;
                }
                left++;
            }
        }

        return minLen;
    }
}
