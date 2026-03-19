package com.amex;

import java.util.HashSet;
import java.util.Set;

public class MinDeletions {
    static void main(String[] args) {
        System.out.println(minDeletetions("abbcbccd"));
    }

    private static int minDeletetions(String str) {
        int[] freq = new int[26];
        for(char c: str.toCharArray()){
            freq[c-'a']++;
        }
        Set<Integer> set = new HashSet<>();
        int deletions = 0;
        for(int f : freq){
            while(f >0 && set.contains(f)){
                f--; //delete one char
                deletions++;
            }
            if(f > 0){
                set.add(f);
            }
        }
        return deletions;
    }
}
