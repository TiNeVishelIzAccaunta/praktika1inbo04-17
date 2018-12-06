package com.labi.com.labi.pr3;

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
