package com.labi.com.labi.pr3;

public class Circle extends Forma {
        protected double radius;
        public Circle() {};
        public Circle(double radius) {
            this.radius=radius;
        }
        public Circle(double radius,String color,boolean filled) {
            this.radius=radius;
            this.color=color;
            this.filled=filled;
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius=radius;
        }
        public double getArea() {
            return radius*radius*3.14;
        }
        public double getPerimeter() {
            return 2*3.14*radius;
        }
        public String toString() {
            return color+" circle";
        }



    }

