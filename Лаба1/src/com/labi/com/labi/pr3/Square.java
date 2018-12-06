package com.labi.com.labi.pr3;

public class Square extends Rectangle {
    public Square() {};
    public Square(double scale) {
        length=scale;
    }
    public Square(double scale,String color,boolean filled) {
        length=scale;
        this.color=color;
        this.filled=filled;
    }
    public double getArea() {
        return length*length;
    }
    public double getPerimeter() {
        return 4*length;
    }
    public String toString() {
        return color+" squer";
    }
}
