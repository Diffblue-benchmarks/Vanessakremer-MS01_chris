package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawMap extends JPanel{

	//Test map = new Test();
	Buildings map;
	
	public DrawMap() {
		map.dateieinlesen();
		
		setLayout(null);
		setBounds(0, 0, MyFrame.width, ((MyFrame.height * 3) / 4));
		setPreferredSize(new Dimension(MyFrame.width, ((MyFrame.height * 3) / 4)));
		setVisible(true);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
		
		//draw Background
		g.setColor(Color.white);
		g.fillRect(0, 0, 800, 600);
		
		//draw Border
		g.setColor(Color.black);
		g.drawRect(0, 0, 800, 600);
		
		//draw Grid and map
		for(int i = 0; i < 40; i++) {
			for(int j = 0; j < 30; j++) {
				if(map.map[i][j] == 'S') {
					g.setColor(Color.LIGHT_GRAY);
					g.fillRect(i * 20, j * 20, 20, 20);
				}
				if(map.map[i][j] == 'G') {
					g.setColor(Color.yellow);
					g.fillRect(i * 20, j * 20, 20, 20);
				}
				if(map.map[i][j] == 'P') {
					g.setColor(Color.green);
					g.fillRect(i * 20, j * 20, 20, 20);
				}	
				if(map.map[i][j] == 'F') {
					g.setColor(Color.red);
					g.fillRect(i * 20, j * 20, 20, 20);
				}
				if(map.map[i][j] == 'W') {
					g.setColor(Color.DARK_GRAY);
					g.fillRect(i * 20, j * 20, 20, 20);
				}
				if(map.map[i][j] == 'K') {
					g.setColor(Color.blue);
					g.fillRect(i * 20, j * 20, 20, 20);
				}
				if(map.map[i][j] == 'M') {
					g.setColor(Color.black);
					g.fillRect(i * 20, j * 20, 20, 20);
				}
				if(map.map[i][j] == 'O') {
					g.setColor(Color.magenta);
					g.fillRect(i * 20, j * 20, 20, 20);
				}
				g.setColor(Color.gray);
				g.drawRect(i * 20, j * 20, 20, 20);
			}
		}
		
		repaint();
	}
	
}

	
