package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected  double length;
    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        width = 2;
        length=4;
    }

    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length=length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width * length;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", length: "+this.length;
    }
}
