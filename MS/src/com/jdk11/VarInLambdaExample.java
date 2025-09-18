package com.jdk11;

import java.util.stream.IntStream;

public class VarInLambdaExample {
	public static void main(String[] args) {
		IntStream.of(1,2,3,4,5,6,7)
		.filter((var i)-> i%2 ==0)
		.forEach(System.out::println);
	}
}
