package gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Buildings {
	
	static char map[][] = new char[40][30];
	static char gebaeude[] = new char[1200];
	static InputStream input1 = Buildings.class.getResourceAsStream("MAP-gebaeudeart.txt");
	

	static void dateieinlesen() {
		try (BufferedReader reader1 = new BufferedReader(new InputStreamReader(input1, StandardCharsets.UTF_8))) {
			String line;
			while ((line = reader1.readLine()) != null) {
				for (int i = 0; i < gebaeude.length; i++) {
					gebaeude[i] = line.charAt(i);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		int k = 0;
		for(int j = 0; j < 30; j++) {
			for(int i = 0; i < 40; i++) {
				map[i][j] = gebaeude[k];
				k++;
			}
		}
	}
}
