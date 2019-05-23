package gui;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;

public class MyFrame extends JFrame {
	
	MyFrame mf;
	JMenuBar mb ;
	JMenu gameoptions;
	
	public static int width = 800, height = 800;
	public static int width_off = 0, height_off = 0;
	public static int gridSize = 20;
	
	MainPanel mainPanel;
	MapPanel mapPanel;
	DrawMap drawMap;
	JScrollPane scrollPane;
	
	Car car;
	
	HelpPanel hp1;
	HelpPanel hp2;
	HelpPanel hp3;
	HelpPanel hp4;
	HelpPanel hp5;
	HelpPanel hp6;
	HelpPanel hp7;
	
	
	public void display() {
		mf = new MyFrame();
		mf.setSize(width, height);
		mf.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		
		createLayout();		
		mf.setVisible(true);
		
		addCar();
	}
	
	class start implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Start");
		}
	}
	
	class pause implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Pause");
		}
	}
	
	class stop implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Stop");
		}
	}
	
	public void addCar() {
		
		car = new Car();
		car.setBounds(0, 0, gridSize, gridSize);
		car.setPreferredSize(new Dimension(gridSize, gridSize));
		drawMap.add(car);
		
		CarThread car1 = new CarThread(car);
		car1.run();		
	}
	
	public void createLayout() {
		
		mainPanel = new MainPanel();
		mf.add(mainPanel);
		
		mapPanel = new MapPanel();
		mainPanel.add(mapPanel, BorderLayout.NORTH);
		
		drawMap = new DrawMap();
		
		scrollPane = new JScrollPane(drawMap);
		scrollPane.setPreferredSize(new Dimension(width, ((height * 3) / 4)));
		scrollPane.setBounds(0, 0, width, ((height * 3) / 4));
		scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED));
		mapPanel.add(scrollPane, 0, 0);
		
		hp1 = new HelpPanel();
		mainPanel.add(hp1, BorderLayout.SOUTH);
		hp2 = new HelpPanel();
		hp2.setPreferredSize(new Dimension(width / 2, height / 4));
		hp2.setBackground(Color.red);
		hp1.add(hp2, BorderLayout.WEST);
		hp3 = new HelpPanel();
		hp3.setPreferredSize(new Dimension(width / 2, height / 4));
		hp3.setBackground(Color.blue);
		hp1.add(hp3, BorderLayout.EAST);
		hp4 = new HelpPanel();
		hp4.setPreferredSize(new Dimension(width / 4, height / 4));
		hp4.setBackground(Color.green);
		hp2.add(hp4, BorderLayout.WEST);
		hp5 = new HelpPanel();
		hp5.setPreferredSize(new Dimension(width / 4, height / 4));
		hp5.setBackground(Color.yellow);
		hp2.add(hp5, BorderLayout.EAST);
		hp6 = new HelpPanel();
		hp6.setPreferredSize(new Dimension(width / 4, height / 4));
		hp6.setBackground(Color.pink);
		hp3.add(hp6, BorderLayout.WEST);
		hp7 = new HelpPanel();
		hp7.setPreferredSize(new Dimension(width / 4, height / 4));
		hp7.setBackground(Color.cyan);
		hp3.add(hp7, BorderLayout.EAST);
		
		//mf.requestFocus(true);
		
		mb = new JMenuBar();
		mf.setJMenuBar(mb);
		gameoptions = new JMenu("Optionen");
		mb.add(gameoptions);
		JMenuItem start = new JMenuItem("Start");
		gameoptions.add(start);
		JMenuItem pause = new JMenuItem("Pause");
		gameoptions.add(pause);
		JMenuItem stop = new JMenuItem("Stop");
		gameoptions.add(stop);
		
		start.addActionListener(new start());
		pause.addActionListener(new pause());
		stop.addActionListener(new stop());		
	}
	
}
