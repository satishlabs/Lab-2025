package com.infogain.nested;

public class C {
    static void main() {
        //B obj = new A();
       // A.B obj = new A(); //Change new A() to new B()
       // C c = new A();  //Change new A() to new C()
      //  C c = new A.B();
        //D d = new A();
        A a1 = new A();
        a1.m1();
      //  A a2 = new A.B();
        A.B a2 = new A.B();
        a2.m1();
        A.D a3 = a1.new D();
        a3.m1();

       // A.B b = new A.B();

    }
}
