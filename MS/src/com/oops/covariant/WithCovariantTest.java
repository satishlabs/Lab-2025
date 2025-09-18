package com.oops.covariant;
 class Animal {
	public Animal giveBirth() {
		System.out.println("An Animal is born");
		return new Animal();
	}
}

class Dog extends Animal{
	// Overriding method can now return 'Dog', a subclass of 'Animal'
	@Override
	public Dog giveBirth() {// Notice the return type is now Dog, not Animal
		System.out.println("An Animal is born");
		return new Dog(); 
	}
}

//An overriding method in a subclass can have a return type 
//that is a subclass of the superclass method's return type.

public class WithCovariantTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal baby = dog.giveBirth(); // This works...
		
        // No cast needed! The compiler knows giveBirth() returns a Dog.
		Dog puppy = dog.giveBirth();// This is clean and type-safe!
    
	}
}
