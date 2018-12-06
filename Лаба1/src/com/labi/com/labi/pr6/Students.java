package com.labi.com.labi.pr6;

public class Students {
    private String name="";
    private int idstudent=0;
    public Students (String fname, int ids) {
        name=fname;
        idstudent=ids;
    }
    public int get_idstudent() {
        return idstudent;
    }
    public String get_name() {
        return name;
    }
}
