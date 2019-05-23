//package map;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//
//public class Gebaeudeart {
//
//	static char gebaeude[] = new char[1200];
//	static InputStream input1 = Main.class.getResourceAsStream("MAP-gebaeudeart.txt");
//	
//
//	static void dateieinlesen() {
//		try (BufferedReader reader1 = new BufferedReader(new InputStreamReader(input1, StandardCharsets.UTF_8))) {
//			String line;
//			// Read new lines until readLine() returns null
//			while ((line = reader1.readLine()) != null) {
//				// hier wird die gespeichert -- was für ein zwischenspeicher?
//				for (int i = 0; i < gebaeude.length; i++) {
//					gebaeude[i] = line.charAt(i);
//				}
//			}
//
//			// werte auslesen
//			int j = 0;
//			for (int i = 0; i < gebaeude.length; i++) {
//				System.out.print(gebaeude[i] + " ");
//				j++;
//				if (j == 40) {
//					System.out.println("");
//					j = 0;
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		}
//	
//	
//	
//	}
