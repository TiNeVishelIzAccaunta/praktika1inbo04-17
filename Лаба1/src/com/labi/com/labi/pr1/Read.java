package com.labi.com.labi.pr1;

public class Read {
    private String avthor="";
    private String title="";
    private int pagecount=1;
    public Read(String name,String firsttitle) {
        avthor=name;
        title=firsttitle;
    }
    public void getRead() {
        System.out.print(title + " Автор книги " + avthor + " и он написал " + pagecount + " страниц.");
    }
    public void changetitle(String newtitle) {
        title=newtitle;
    }
    public void addpage(int count) {
        pagecount=pagecount+count;
    }
    public void subtuctpage(int count) {
        pagecount=pagecount-count;
    }
}
