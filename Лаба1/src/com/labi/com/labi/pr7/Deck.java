package com.labi.com.labi.pr7;

import java.util.Stack;

public class Deck {
    public boolean lose=false;
    private Stack<Integer> deck= new Stack<Integer>();
    Deck (int a[]){
        for (int i=4;i>=0;i--) {
            deck.push(a[i]);

        }
    }
    public int getup() {

        return deck.peek();

    }
    public void win(int drop) {
        Stack<Integer> virt= new Stack<Integer>();
        int up =deck.peek();
        deck.pop();
        while (!deck.isEmpty())	 {
            virt.push(deck.peek());
            deck.pop();
        }
        virt.push(up);
        virt.push(drop);
        while (!virt.isEmpty())	 {
            deck.push(virt.peek());
            virt.pop();
        }
    }
    public void lose() {
        deck.pop();
        if (deck.isEmpty()) {
            lose=true;
        }
    }
}