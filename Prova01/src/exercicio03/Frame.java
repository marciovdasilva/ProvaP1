package exercicio03;

import java.awt.Color;
import java.awt.Container;
import java.awt.Paint;
import java.awt.Point;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	public Frame(){
		super();
		Paint pt = (Paint) new Point();
		((Frame) pt).setBackground(Color.WHITE);
		
		this.setContentPane((Container) pt);
	}
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setSize(800, 800);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}

}
