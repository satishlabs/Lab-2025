package com.str;

import java.util.Arrays;
import java.util.List;

public class LongestStringPlaindrom {
	public static void main(String[] args) {
		String str = "babad";
		System.out.println(longestSubstringPalindrom(str));
        System.out.println("\n");
        List<String> words = Arrays.asList("hello", "level", "world", "radar");
        String noPalindromeFound = words.stream()
                .filter(w -> new StringBuilder(w).reverse().toString().equals(w)).findFirst().orElse("No Palindrome found");
        System.out.println(noPalindromeFound);
    }

	private static String longestSubstringPalindrom(String str) {
		String longest = "";
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				String sub = str.substring(i, j+1);
				if(isPlaindrome(sub) && sub.length() > longest.length()) {
					longest = sub;
				}
			}
		}
		return longest;
	}

	private static boolean isPlaindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left < right) {
			if(str.charAt(left++) != str.charAt(right--))
				return false;
		}
		return true;
	}

}
