package com.labi.com.labi.pr2;
import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            String name="";
            String email="";
            String text="";
            char gender=' ';
            System.out.println("Введите имя: ");
            name=in.nextLine();
            System.out.println("Введите маил: ");
            email=in.nextLine();


            do  {
                System.out.println("Введите пол: (М или Ж)");
                text=in.nextLine();
                if ((text.charAt(0)=='М')||(text.charAt(0)=='Ж')) {
                    gender=text.charAt(0);
                }
            }
            while ((text.charAt(0)!='М')&(text.charAt(0)!='Ж'));
            Autor human = new Autor (name,email,gender);
            System.out.println( human.ToString());
            in.close();
        }


    }

