package com.labi.laba7;

import java.util.ArrayList;


public class TestArrayList
{
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add("Филадельфия");
        states.add(1, "Италия");
        states.add(0,"Россия");
        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states)
        {
            System.out.println(state);
        }

    }
}