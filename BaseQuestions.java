package edu.stevens.ee552.quiz.gui;

import java.awt.*;
import javax.swing.*;


public class BaseQuestions extends JFrame{
	private int type;
	
	private void buildView(Container c) {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(new TextArea("question!"));
		c.add(p, BorderLayout.NORTH);
	}
	
	public BaseQuestions() {
		Container c = getContentPane();
		buildView(c);
		setSize(900, 900);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BaseQuestions();
	}

}
