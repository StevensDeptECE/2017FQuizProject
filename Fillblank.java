package edu.stevens.ee552.quiz.GUI.Filling;


import java.awt.*; // Font, Color, ...
import javax.swing.*; //JFrame JPanel
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class Fillblank extends JPanel {
    private String ansHint;
    private String ans;
    private String ansName;


    public Fillblank(String ans1, String ansHint1, String ansName1){
        ans=ans1;
        ansHint=ansHint1;
        ansName=ansName1;

        this.setBounds(100, 100, 250, 200);
        JPanel contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new GridLayout(2,1,5,5));
        JPanel pane1=new JPanel();
        contentPane.add(pane1);
        pane1.setLayout(new GridLayout(4,1,5,5));
        JLabel label1=new JLabel(ansName);
        JLabel labelans1=new JLabel(ansHint);
        JTextField textField1=new JTextField();
        textField1.setColumns(10);
        pane1.add(label1);
        pane1.add(textField1);
        pane1.add(labelans1);

        labelans1.setForeground(Color.RED);
        labelans1.setVisible(false);
        JButton nButton = new JButton("ok");
        pane1.add(BorderLayout.NORTH, nButton);
        nButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!textField1.getText().equals(ans))
                    labelans1.setVisible(true);
                else labelans1.setVisible(false);
            }
        });
        add(contentPane);
        this.setVisible(true);
    }



}

