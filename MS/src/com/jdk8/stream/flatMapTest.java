package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class flatMapTest {
	public static void main(String[] args) {
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("AA","BB"),
				Arrays.asList("CC", "DD"),
				Arrays.asList("EE", "FF")
				);
		
	List<String> flatList =	nestedList.stream()
		.flatMap(List::stream)
		.toList();
	
	System.out.println(flatList);
	}
	
	
}
