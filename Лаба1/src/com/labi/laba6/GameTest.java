package com.labi.laba6;

import javax.swing.*;

public class GameTest {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Введи число от 0 до 20: "));
        int i = 0;
        while (i < 3) {
            if (number < 10) {
                JOptionPane.showMessageDialog(null, "Ты не угадал, число должно быть больше 10");
                i = i + 1;
            }
            if ((number > 15) || ((number > 10) && (number < 15))) {
                JOptionPane.showMessageDialog(null, "Ты не угадал, число должно быть меньше 16, но больше 10");
                i = i + 1;
            }
            if (number == 15) {
                JOptionPane.showMessageDialog(null, "Ты угадал");
                i = 3;
            }
            if (i != 3) {
                number = Integer.parseInt(JOptionPane.showInputDialog("Введи число от 0 до 20: "));
            }
        }
        }
    }
