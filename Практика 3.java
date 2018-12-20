//Cirlce.java
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
//Forma.java
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
//Rectangle.java

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
//Square.java
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
//Test2.java
public class Test2 {
    public static void main(String[] args) {
        Circle n = new Circle (5,"green",true) ;
        System.out.println(n.getArea());
        System.out.println(n.toString());
        Rectangle z = new Rectangle (5,7,"blue",true) ;
        System.out.println(z.getArea());
        System.out.println(z.getPerimeter());
        System.out.println(z.toString());
        Square z1 = new Square (5,"red",true) ;
        System.out.println(z1.getArea());
        System.out.println(z1.getPerimeter());
        System.out.println(z1.toString());
    }

}
