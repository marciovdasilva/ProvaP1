package exercicio02;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Points extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;

      int w = getWidth();
      int h = getHeight();
      
      int x = (w/2);
      int y = (h/2);
      
      g2.drawLine(w/2, 0,w/2, h);
      g2.drawLine(0, 0, x -10, h);
      g2.drawLine(x + 10, h, w , 0);
      g2.drawLine(w, y, 0, h);
      //g2.drawLine(w, y, 0, h);
  	}

public static void main(String[] args) {
    Points points = new Points();
    JFrame frame = new JFrame("Points");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(points);
    ///
    frame.setSize(250, 200);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    
	}
}