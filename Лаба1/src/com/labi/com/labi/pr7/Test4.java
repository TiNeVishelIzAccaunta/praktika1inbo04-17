package com.labi.com.labi.pr7;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num[]= new int[5];
        System.out.println("Введите 5 чисел: ");
        for (int i=0;i<5;i++) {
            num[i]=in.nextInt();
        }

        Deck playerone = new Deck(num);
        System.out.println("Введите 5 чисел: ");
        for (int i=0;i<5;i++) {
            num[i]=in.nextInt();
        }

        Deck playertwo = new Deck(num);
        int trigger=0;
        while ((!playerone.lose) && (!playertwo.lose) && (trigger<106)) {
            trigger++;
            if (playerone.getup()>playertwo.getup() ||(playerone.getup()==0)&&(playertwo.getup()==9) ) {
                playerone.win(playertwo.getup() );
                playertwo.lose();
            }
            else if (playerone.getup()<playertwo.getup() ||(playerone.getup()==9)&&(playertwo.getup()==0) ) {
                playertwo.win(playerone.getup() );
                playerone.lose();
            }
        }
        if (playerone.lose) {
            System.out.println("Player two win");
        }
        if (playertwo.lose) {
            System.out.println("Player one win");
        }
        System.out.println("Time"+trigger);
        in.close();
    }
}
