package com.desginpattern.builder;


/*Benefits of Builder Pattern:
Readable code with method chaining

Immutable objects

Reduces constructor overloads

Easy to manage optional vs required fields*/

public class MainBuilder {
	public static void main(String[] args) {
		User user = new User.Builder("Satish", 28)
				.email("sat@gmail.com")
				.address("Bangalore")
				.build();
		System.out.println(user);
	}
}
