package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class HelpPanel extends JPanel{
	
	public HelpPanel() {
		setBackground(Color.white);
		setPreferredSize(new Dimension(800, 200));
		setLayout(new BorderLayout());
		setVisible(true);
	}

}
