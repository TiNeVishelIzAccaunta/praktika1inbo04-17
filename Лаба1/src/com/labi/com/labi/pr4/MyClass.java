package com.labi.com.labi.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyClass extends JFrame
{
    private static final long serialVersionUID = -800300207365150577L;
    JLabel lbl = new JLabel("");
    public MyClass()
    {
        super("А в какие координаты я нажимаю??? ");
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {lbl.setText("X="+a.getX()+" Y="+a.getY());}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new MyClass().setVisible(true);
    }
}
