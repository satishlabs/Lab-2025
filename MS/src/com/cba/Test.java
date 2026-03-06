package com.cba;
class A{
    static {
        System.out.println("S1 ");
    }
    {
        System.out.println("I1");
    }
    A(){
        System.out.println("C1");
    }
}

class B extends A{
    static {
        System.out.println("S2 ");
    }
    {
        System.out.println("I2");
    }
    B(){
        System.out.println("C2");
    }
}
public class Test {
    static void main(String[] args) {
        System.out.println("M ");
        new B();
    }
}
