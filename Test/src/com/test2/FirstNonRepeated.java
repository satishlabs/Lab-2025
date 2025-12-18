package com.test2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
	public static void main(String[] args) {
		//Given a String, find the first non-repeated character in it using Stream functions
		String str = "satish";
		char ch = str.chars()
			.mapToObj(c -> (char)c)
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e ->e.getValue() ==1)
			.map(Map.Entry::getKey)
			.findFirst()
			.orElseThrow();
		System.out.println(ch);
		//api- should count++;
	}
	
	
	
	
	/*
	 dependency:
	 spring-boot-starter-ac
	
	http://localhost:8080/actutor/metrices/
	
	class Test{
	
		int count=0;
		
		class Test(int count){
			count = 
		
		}
		
	}
	
	int count=0;
	
	@GetMapping("/count")
	public Integer count(){
		return count++;
	}
	
	
	 //Count of api hits
	 ///
	 * 
	 * 
	 * */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
