package com.labi.laba2;

public class CircleTest
{
    public static void main(String[] args)
    {
       Circle test = new Circle(0);
       test.setRadius();
       test.setDiametr();
       test.setDlina();
       System.out.println("Радиус круга" + " " + test.getRadius());
       System.out.println("Диаметр круга" + " " + test.getDiametr());
       System.out.println("Длина окружности" + " " + test.getDlina());
    }
}
