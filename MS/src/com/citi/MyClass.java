package com.citi;

public class MyClass {

	@MyAnnotation(value = "Run me", count=2)
	public void sayHello() {
		System.out.println("Hello from myClass");
	}
}
