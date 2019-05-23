package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Car extends JPanel {
	
	Image car = null;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		car = car.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		g.drawImage(car, 0, 0, null);
		repaint();
	}
	
	public Car() {
		setPreferredSize(new Dimension(20, 20));
		setLayout(null);
		setVisible(true);
		
		try {
			InputStream input = getClass().getResourceAsStream("car_blue.png");
			car = ImageIO.read(input);
		}catch(IOException e){
			e.printStackTrace();
			System.err.println("Fehler beim Laden des Bildes!");
		}
		
	}
	

}
