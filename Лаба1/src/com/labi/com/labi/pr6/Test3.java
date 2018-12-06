package com.labi.com.labi.pr6;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Students[] univ= new Students[5];
        String text="";
        int num=0;
        for (int i=0;i<5;i++) {
            System.out.println("Введите имя: ");
            text=in.nextLine();
            System.out.println("Введите ID: " + text + " ");
            num = in.nextInt();
            univ[i]=new Students(text,num*100+i);
            text=in.nextLine();
        }
        Sortirovka m= new Sortirovka();
        univ=m.don(univ);
        for (int i=0;i<5;i++) {
            System.out.println(univ[i].get_name());
        }
        in.close();
    }
}
