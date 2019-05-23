package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int map_height = 30;
		int map_length = 40;
		Field[][] map = new Field[map_height][map_length];

		// Text Dokument werden eingelesen
		InputStream input1 = Main.class.getResourceAsStream("MAP-gebaeudeart.txt");
		InputStream input2 = Main.class.getResourceAsStream("MAP-geschwindigkeit.txt");
//		InputStream input3 = Main.class.getResourceAsStream("MAP-richtungen.txt");

		// Einlesen des InputStream in UTF-8 und BufferedReader liest Zeilen ein

		try {
			BufferedReader reader_art = new BufferedReader(new InputStreamReader(input1, StandardCharsets.UTF_8));
			BufferedReader reader_geschwindigkeit = new BufferedReader(
					new InputStreamReader(input2, StandardCharsets.UTF_8));
//			BufferedReader reader_richtung = new BufferedReader(new InputStreamReader(input2, StandardCharsets.UTF_8));

			// liest Zeilenweise die txt aus
			for (int height = 0; height < map_height; height++) {
				String line_gebaeudeart = reader_art.readLine();
				String line_geschwindigkeit = reader_geschwindigkeit.readLine();
//				String line_richtung = reader_richtung.readLine();

				for (int length = 0; length < map_length; length++) {
					char gebaeudeart = line_gebaeudeart.charAt(length);
					int geschwindigkeit = Character.getNumericValue(line_geschwindigkeit.charAt(length));
					
					
					map[height][length] = new Field(gebaeudeart, geschwindigkeit, false, false, false, false);
				}
//					if(gebaeudeart == 'S') {
						//prüfe Stellen oben, unten, rechts, links
						/*
						 * if(gebäudeart im Feld rechts == S){
						 * 		boolean richtungost = true;
						 * }else{
						 * 		boolean richtungost = false;
						 * }
						 * if(alle anderen){
						 * 		...
						 * }
						 */
//					}
					

					// TODO: 'S' durch richtung ersetzen
					
				}


		}	catch (IOException e) {
			e.printStackTrace();
		}
	
		for (int height = 0; height < map_height; height++) {
			Field[] map_line = map[height];
			System.out.println(Arrays.deepToString(map_line));
			}
			
//		for(int i = 0; i < map.length; i++) {
//			for(int j = 0; j < map.length; j++) {
//				
//				if(map[i][j].getGebaeudeart() =='L'){
//					System.out.print("-");					
//				}else if(map[i][j].getGebaeudeart() =='S') {
//					System.out.print("S");
//				}else if(map[i][j].getGebaeudeart() =='G') {
//					System.out.print("G");
//				}else if(map[i][j].getGebaeudeart() =='P') {
//					System.out.print("P");
//				}else if(map[i][j].getGebaeudeart() =='F') {
//					System.out.print("F");
//				}else if(map[i][j].getGebaeudeart() =='W') {
//					System.out.print("W");
//				}else if(map[i][j].getGebaeudeart() =='K') {
//					System.out.print("K");
//				}else if(map[i][j].getGebaeudeart() =='H') {
//					System.out.print("H");
//				}else if(map[i][j].getGebaeudeart() =='O') {
//					System.out.print("O");
//				}else if(map[i][j].getGeschwindigkeit() =='0') {
//					System.out.print("-");
//	 			}else if(map[i][j].getGeschwindigkeit() =='7') {
//					System.out.print("70");
//				}else if(map[i][j].getGeschwindigkeit() =='1') {
//					System.out.print("100");
//				}else if(map[i][j].getGeschwindigkeit() =='5') {
//					System.out.print("50");
//				}else if(map[i][j].getGeschwindigkeit() =='3') {
//					System.out.print("30");
//				}
//			}
//			System.out.println(" ");
//			
			
//		}


		}


//		informationen(map);



}
