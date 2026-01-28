package com.alti.str;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findSmallestWindow {
    static void main() {
        System.out.println(findSmallestWindow("aaab"));
    }
    public static int findSmallestWindow(String str) {
        if (str == null || str.length() == 0) return 0;

        // Step 1: Count distinct characters
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        int requiredCount = set.size();

        // Sliding window
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, minLen = Integer.MAX_VALUE;
        int matched = 0;

        for (int end = 0; end < str.length(); end++) {
            char endChar = str.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);

            // First time this char is fully included
            if (map.get(endChar) == 1) {
                matched++;
            }

            // When all distinct characters are present
            while (matched == requiredCount) {

                // Update answer
                minLen = Math.min(minLen, end - start + 1);

                char startChar = str.charAt(start);
                map.put(startChar, map.get(startChar) - 1);

                // If removing makes count 0 → window invalid
                if (map.get(startChar) == 0) {
                    matched--;
                }

                start++;
            }
        }

        return minLen;
    }
}
