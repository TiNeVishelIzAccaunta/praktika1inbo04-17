package com.labi.laba4;

public class Test
{
    public static void main(String[] args)
    {
       Nameable x = new Animals("Тигр", "Кошачьих", "Хищник");
       x.getName();
       Nameable y = new Animals("Орёл", "Пернатых", "Хищник");
       y.getName();
       Nameable x1 = new Cars("Shkoda", 100, "Germany");
       x1.getName();
    }
}
