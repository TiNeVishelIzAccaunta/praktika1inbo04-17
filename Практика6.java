//Sort.java
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
//Students.java
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
//Test.java
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
