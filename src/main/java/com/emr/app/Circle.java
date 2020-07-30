package com.emr.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle extends JPanel {

	private char ch;

	public Circle(char ch) {
		this.ch = ch;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = this.getWidth();
		int h = this.getHeight();
		setSize(w, h);
		Ellipse2D myEllipse = new Ellipse2D.Double(0, 0, w, h);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.decode("#ff1a1a"));
		g2d.fill(myEllipse);

		g2d.setColor(Color.CYAN);
		g2d.setFont(new Font("Open Sans", Font.BOLD, 48));
		g2d.drawString(String.valueOf(ch), w/2, h);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Circle panel = new Circle('V');
		frame.setSize(100, 100);
		frame.add(panel);
		frame.setVisible(true);
	}

}
