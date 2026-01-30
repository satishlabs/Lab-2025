package com.infogain.nested;

public class A {
    void m1(){
        System.out.println("A - m1()");
    }

   static class B{
        void m1(){
            System.out.println("A,B -- m1()");
        }
    }

    class D{
        void m1(){
            System.out.println("A,D - m1()");
        }
    }
}
