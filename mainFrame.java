package edu.stevens.ee552.quiz.GUI.Filling;

import javax.swing.*;
import java.awt.*; // Font, Color, ...

public class mainFrame extends JFrame{
    public mainFrame() {
        setSize(300, 300);
        Container c = getContentPane();
        c.setBackground(Color.RED);
        c.add(new Fillblank("2","Wrong! Answer is 2","1+1=?"));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new mainFrame();
    }
}

