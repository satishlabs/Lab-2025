package com.hexaware;

@FunctionalInterface
interface TriPredicate<A, B, C>{
    boolean test(A a, B b, C c);
}
public class TestFunctional {
    static void main(String[] args) {
        TriPredicate<Integer, Integer,Integer> isValid = (a,b,c) ->(a+b+c)>50;
        System.out.println(isValid.test(10, 20, 30)); // true
    }
}
