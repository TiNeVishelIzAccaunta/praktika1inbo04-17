
package com.labi.laba1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=0;
        int x=0;
        int y=0;
        int[] masiv = new int[10];
        for(int i=0; i<10; i++)
        {
            masiv[i] = t++;
        }
        int sumaFor=masiv[0];
        for(int i=0; i<9; i++)
        {
            sumaFor=sumaFor+masiv[i+1];
        }
        int sumaWhile=masiv[0];
        while(x<9)
        {
            sumaWhile=sumaWhile+masiv[x+1];
            x++;
        }
        int sumaDoWhile=0;
        do
        {
           sumaDoWhile=sumaDoWhile+masiv[y+1];
           y++;
        }while(y<9);
        System.out.println("Массив");
        for(int i=0; i<10; i++)
        {
            System.out.println(masiv[i]);
        }
        System.out.println("Сумма с помощью цикла for");
        System.out.println(sumaFor);
        System.out.println("Сумма с помощью цикла while");
        System.out.println(sumaWhile);
        System.out.println("Сумма с помощью цикла do-while");
        System.out.println(sumaDoWhile);
    }
}
