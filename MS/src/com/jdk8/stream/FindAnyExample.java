package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Satish","John","Peter","Mark","Piyush");
		Optional<String> anyName = names.parallelStream()
				.filter(name -> name.startsWith("P"))
				.findAny();
		anyName.ifPresent(System.out::println);// Output: Peter (or could be any match)
	}
}
