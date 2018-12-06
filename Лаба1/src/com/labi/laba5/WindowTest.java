package com.labi.laba5;

import javax.swing.*;

class MyFrame
{
    MyFrame(int x, int y) {
        JFrame window = new JFrame("Картиночка");
        window.setBounds(x,y,350,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icn = new ImageIcon("D:/File/kartinka2.gif");
        JLabel lbl = new JLabel(icn,JLabel.CENTER);
        window.add(lbl);
        window.setVisible(true);
    }
}
public class WindowTest {
    public static void main(String[] args) {
        new MyFrame(300,400);
    }
}
