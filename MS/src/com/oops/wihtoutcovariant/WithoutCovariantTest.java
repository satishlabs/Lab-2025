package com.oops.wihtoutcovariant;
 class Animal {
	public Animal giveBirth() {
		System.out.println("An Animal is born");
		return new Animal();
	}
}


class Dog extends Animal{
	// Overriding method MUST return 'Animal'
	@Override
	public Animal giveBirth() {
		System.out.println("An Animal is born");
		return new Dog(); // We are returning a Dog, but have to declare it as Animal
	}
}
public class WithoutCovariantTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal baby = dog.giveBirth(); // This works...
		// But if we know it's a Dog, we need an explicit, ugly cast
		Dog puppy = (Dog) dog.giveBirth();// This cast is required and can be error-prone
	}
}
