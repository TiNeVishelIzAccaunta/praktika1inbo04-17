package com.labi.com.labi.pr3;

public abstract class Forma {
    protected String color ="";
    protected boolean filled =true;
    public Forma() {

    };
    public Forma(String color, boolean filled) {
        this.color=color;
        this.filled=filled;
    };
    public void setcolor(String color) {
        this.color=color;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setfilled(boolean filled) {
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}
