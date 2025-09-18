package com.jdk11;

import java.util.stream.Collectors;

public class LinesTest {
	public static void main(String[] args) {
		String str = "Hello\nhow\nare\nyou";
		System.out.println(str.lines().collect(Collectors.toList())); //[Hello, how, are, you]
	}
}
