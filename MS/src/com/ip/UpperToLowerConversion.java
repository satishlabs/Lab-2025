package com.ip;

import java.util.Scanner;

public class UpperToLowerConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		System.out.println("Enter a string in UPPERCASE");
		String upper = scanner.nextLine();

		// Method 1: Using String .toLowerCase()
		String lower1 = upper.toLowerCase();
		System.out.println("Method 1: " + lower1);

		// Method 2: Using Character.toLowerCase
		StringBuilder lower2 = new StringBuilder();
		for (int i = 0; i < upper.length(); i++) {
			lower2.append(Character.toLowerCase(upper.charAt(i)));
		}
		System.out.println("Method 2: " + lower2);

		// Method 3: Using ASCII manipulation
		StringBuilder lower3 = new StringBuilder();
		for (int i = 0; i < upper.length(); i++) {
			char ch = upper.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32); // ASCII diff between upper and lower
			}
			lower3.append(ch);
		}
		System.out.println("Method 3: " + lower3);

		// Method 4: Using Java 8 Streams
		String lower4 = upper.chars()
				.mapToObj(c -> String.valueOf(Character.toLowerCase((char)c)))
				.reduce("",String::concat);
		System.out.println("Method 4 (Java 8 streams): " + lower4);

		// Method 5: Manual character array conversion
		char[] chars = upper.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				chars[i] = (char) (chars[i] + 32);
			}
		}

		String lower5 = new String(chars);
		System.out.println("Method 5 (Char array manual): " + lower5);

		scanner.close();
	}
}
