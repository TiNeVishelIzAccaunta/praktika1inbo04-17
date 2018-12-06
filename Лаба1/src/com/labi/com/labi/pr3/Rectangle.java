package com.labi.com.labi.pr3;

public class Rectangle extends Forma {
    protected double width;
    protected double length;
    public Rectangle() {};
    public Rectangle(double width,double length) {
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled) {
        this.length=length;
        this.width=width;
        this.color = color;
        this.filled=filled;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length=length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public double getArea() {
        return length*width;
    }
    public double getPerimeter() {
        return 2*(length+width);
    }
    public String toString() {
        return color+" rectangle";
    }
}