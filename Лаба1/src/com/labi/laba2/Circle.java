package com.labi.laba2;

import java.util.Scanner;

public class Circle
{
    Scanner in = new Scanner(System.in);
    private int Radius;
    private int Diametr;
    private float Dlina;
    float p=3.14f;
    public Circle(int r)
    {
        Radius=r;
        Diametr=2*Radius;
        Dlina=2*p*Radius;
    }
    public void setRadius()
    {
        System.out.println("Введите радиус круга:" + " ");
        int r=in.nextInt();
        Radius=r;
    }
    public void setDiametr()
    {
        Diametr=2*Radius;
    }
    public void setDlina()
    {
        Dlina=2*p*Radius;
    }
    public int getRadius()
    {
        return Radius;
    }
    public int getDiametr()
    {
        return Diametr;
    }
    public float getDlina()
    {
        return Dlina;
    }
}
