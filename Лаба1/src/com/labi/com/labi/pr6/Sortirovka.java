package com.labi.com.labi.pr6;

public class Sortirovka {
    public Students[] don(Students[] a) {
        for (int y=0; y<4;y++) {
            for (int x=0;x<4-y;x++) {
                if (a[x].get_idstudent()>a[x+1].get_idstudent()) {
                    Students z = a[x+1];
                    a[x+1]=a[x];
                    a[x]=z;
                }
            }
        }
        return a;
    }
}
