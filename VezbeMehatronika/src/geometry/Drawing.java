package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1200,1000);
		Drawing drawing = new Drawing();
		frame.add(drawing);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	
	public void paint(Graphics g) {
		Point p1 = new Point(100,100);
		Point p2 = new Point(200,200);
		p1.draw(g);
		p2.draw(g);
		Line l1 = new Line(p1,p2);
		l1.draw(g);
		Rectangle r1 = new Rectangle(p1,50,50);
		Circle c1 = new Donut(p2,30,15);
		g.setColor(Color.BLUE);
		r1.draw(g);
		c1.draw(g);
	}
	
	public Drawing() {
		
	}

}
