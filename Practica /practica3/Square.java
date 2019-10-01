package com.company;

public class Square extends Rectangle{
    protected double side;
    public Square() {
        this.filled = false;
        this.color = "blue";
    }
    public Square(double side) {
        this.filled = false;
        this.color = "blue";
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return 6*side;
    }

    @Override
    public double getPerimeter() {
        return 12 * side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.side + "";
    }
}
