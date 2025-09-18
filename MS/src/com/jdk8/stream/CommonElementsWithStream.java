package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsWithStream {
	public static void main(String[] args) {
		try {
			List<String> list1 = Arrays.asList("Apple","Banana","Mango", "Orange");
			List<String> list2 = Arrays.asList("Mango", "Grapes", "Apple", "Pineapple");
			
			//Find comman Elements
			List<String> commonElements = list1.stream()
				.filter(list2:: contains)
				.collect(Collectors.toList());
			System.out.println(commonElements);
			
			switch (commonElements.isEmpty() ? "EMPTY" : "NON_EMPTY"){
			case "EMPTY": 
				System.out.println("No common Elements found!");
				break;
			
			case "NON_EMPTY":
				System.out.println("Common Elements: "+ commonElements);
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
		}catch (NullPointerException e) {
			System.out.println("Error: One of the input lists is null.");
		}catch (Exception e) {
			System.out.println("Unpexted Error: "+ e.getMessage());
		}
	}
}
