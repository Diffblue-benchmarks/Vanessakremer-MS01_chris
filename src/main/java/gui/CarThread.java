package gui;

import java.awt.Point;

public class CarThread extends Thread implements Runnable{
	
	int framerate = 60;
	boolean isPaused = false;
	int ms = 1/(framerate * 1000);
	Car car1 = null;
	
	public CarThread(Car car) {
		this.car1 = car;
	}
	
	public void run() {
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		while(!isPaused) {
			Point pos = car1.getLocation();
			if (pos.x >= 760) {
				isPaused = true;
				break;
			} 
			car1.setLocation(pos.x + 2, pos.y);
			
			try {
				sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
