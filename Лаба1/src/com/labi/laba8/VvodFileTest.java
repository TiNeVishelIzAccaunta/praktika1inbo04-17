package com.labi.laba8;

import java.io.*;
import java.util.Scanner;

public class VvodFileTest
{
    static Scanner in = new Scanner(System.in);
    static String text=in.nextLine();

    public static void main(String[] args)
    {
        try(FileWriter writer = new FileWriter("D:\\File\\yargo.txt", false))
        {
            writer.write(text);
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
