package com.labi.laba4;

public interface Nameable
{
    void getName();
}

class Animals implements Nameable
{
    String name;
    String semeistvo;
    String clas;

    Animals(String name, String semeistvo, String clas)
    {
        this.name=name;
        this.semeistvo=semeistvo;
        this.clas=clas;

    }

    public void getName()
    {
        System.out.printf("Порода животного: " + name + "\n" + "Семейство: " + semeistvo + "\n" + "Класс: " + clas + "\n");
    }
}

class Cars implements Nameable
{
    String name;
    int MaxScor;
    String country;

    Cars(String name, int MaxScor, String country)
    {
        this.name=name;
        this.MaxScor=MaxScor;
        this.country=country;
    }

    public void getName()
    {
        System.out.printf("Марка машины: " + name + "\n" + "Максимальная скорость: " + MaxScor + " " + "км/ч" + "\n" + "Страна производитель: " + country + "\n");
    }
}
