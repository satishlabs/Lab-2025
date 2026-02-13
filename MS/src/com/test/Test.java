package com.test;

import java.util.HashSet;
import java.util.Set;

public class Test {
    static void main() {
        Integer a = 128;
        Integer b = 128;

        Integer x = 127;
        Integer y = 127;

        System.out.println(a == b);
        System.out.println(x == y);
        System.out.println("\n==========================");
        Set<Student> set = new HashSet<>();

        Student s1 = new Student(1, "A");
        Student s2 = new Student(1, "B");
        Student s3 = new Student(2, "C");


        set.add(s1);
        set.add(s2);
        set.add(s3);

       // After adding the objects to the HashSet, we do this:
        System.out.println(set.size());
        //s1.id = 2;
    }
}
