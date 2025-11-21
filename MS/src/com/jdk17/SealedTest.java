package com.jdk17;

/*
A sealed class or interface restricts which other classes can extend or implement it.
You explicitly declare which classes are allowed.
public sealed class A permits B, C {
}
Only B and C can extend A. Nothing else.
* */

record Circle(double radius) implements  Shape{}
record Square(double side) implements  Shape{}
record Triangle(double a, double b, double c) implements  Shape{}


public class SealedTest {
    public static double area(Shape shape){
        return switch (shape){
            case Circle c ->Math.PI*c.radius()*c.radius();
            case Square s   -> s.side() * s.side();
            case Triangle t -> t.a() * t.b() / 2;  // simple formula
        };
    }
    public static void main(String[] args) {
        System.out.println("Circle are: "+area(new Circle(5)));
        System.out.println("Square area: "+area(new Square(5)));
        System.out.println("Triangle area: "+area(new Triangle(3,4,5)));
    }
}
