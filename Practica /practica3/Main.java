package com.company;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1.toString());
        Shape s2 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s2.toString());
        Rectangle r1 = (Rectangle)s2;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
    }
}
