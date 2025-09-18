package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Satish","John","Peter","Mark","Piyush");

		Optional<String> firstName = names.stream()
				.filter(name -> name.startsWith("P"))
				.findFirst();
		
		firstName.ifPresent(System.out::println);// Output: Peter
	}
}
