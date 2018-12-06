package com.labi.com.labi.pr1;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print ("Как вас зовут? ");
        String name="";
        name=in.nextLine();
        System.out.print ("Какую книгу вы пишете? ");
        String title="";
        title=in.nextLine();
        Read firstbook= new Read(name,title);
        System.out.print ("Сколько вы написали страниц изначально? ");
        int page=0;
        page = in.nextInt();
        firstbook.addpage(page);
        System.out.print ("Сколько страниц вы отбросили после? ");
        page = in.nextInt();
        firstbook.subtuctpage(page);
        System.out.println ("Каково конечное название книги? ");
        title=in.nextLine();
        title=in.nextLine();
        firstbook.changetitle(title);
        firstbook.getRead();
        in.close();
    }
}