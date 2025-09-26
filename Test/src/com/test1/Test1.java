package com.test1;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//Input = a=10;
		//b=20, sum a+b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		//long a = sc.nextInt();
		BigInteger b1 = sc.nextBigInteger();
		
		System.out.println("Enter first number");
		BigInteger b2 = sc.nextBigInteger();
		
		BigInteger sum = b1.add(b2);
		
		System.out.println(sum);
		
		//var
		
		//n+1/2;
		//2+1/2
		
		//Person - two methods  @Transactional , inside methodA, calling methodB
		//methodA getting called from a class Department
		//How many transcationl will be work here
		
	}
	

}

/*
 class Person{
 	@Transactional
 	methodA(){
 	
 		methodB()
 	}
 			
 	@Transactional()
 	methodB(){
 		
 	}
 
 }
 
 class Dept{
 	Person p = new Person();
 	p.methodA()
 }
 * 
 * */
