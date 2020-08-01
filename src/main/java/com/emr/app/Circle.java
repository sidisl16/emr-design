package com.emr.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

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
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		
		JFrame frame = new JFrame();
		Circle panel = new Circle('V');
		frame.setSize(100, 100);
		frame.add(datePicker);
		frame.setVisible(true);
	}

}
