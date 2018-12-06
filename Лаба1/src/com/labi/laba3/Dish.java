package com.labi.laba3;

public  abstract class Dish
{
    private String name;
    public Dish(String dish)
    {
        this.name=dish;
    }
    public String getDish()
    {
        return name;
    }
    public abstract void Info();
}

class Plate extends Dish
{

    public Plate(String name)
    {
        super(name);
    }

    public int Glubina=300;

    public void Info()
    {
        System.out.println("Название посуды: " + super.getDish() + "\n" + "глубина: " + Glubina + "мл");
    }
}

class Cap extends Dish
{
    public Cap(String name)
    {
        super(name);
    }

    public int Obyom=250;

    public void Info()
    {
        System.out.println("Название посуды: " + super.getDish() + "\n" + "объём: " + Obyom + "мл");
    }
}
