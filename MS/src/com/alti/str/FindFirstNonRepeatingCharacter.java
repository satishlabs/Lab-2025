package com.alti.str;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "satish";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(str));

    }

    private static Character findFirstNonRepeating(String str) {
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for (char c : charArray) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
