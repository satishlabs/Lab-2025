package com.alti.str;
//Ensures only one copy of a string exists in the String Constant Pool.
public class
StringIntern {
    static void main() {
        String a = new String("abc");
        String b = "abc";
        String c = a.intern();

        System.out.println(a==b);// false (heap vs pool)
        System.out.println(a.equals(b));
        System.out.println(b==c);// true  (both pool)
        System.out.println(b.equals(c));
        System.out.println(a==c);
        System.out.println(a.equals(c));

        System.out.println("\n===========================");
        String str1 = new String("hello");
        String str2 = "ABC";
        String str3 = str1.intern();

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
    }
}
/**
 Steps:

 JVM checks pool:

 If "Hello" exists → returns that reference

 Else → adds it to pool

 Returns pooled reference
 *
 */
