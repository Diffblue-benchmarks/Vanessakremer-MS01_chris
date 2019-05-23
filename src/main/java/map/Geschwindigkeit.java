//package map;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//
//public class Geschwindigkeit {
//
//	static char geschwindigkeit[] = new char[1200];
//	static InputStream input2 = Main.class.getResourceAsStream("MAP-geschwindigkeit.txt");
//
//	static void dateieinlesen() {
//
//		try (BufferedReader reader2 = new BufferedReader(new InputStreamReader(input2, StandardCharsets.UTF_8))) {
//			String line;
//
//			// Read new lines until readLine() returns null
//			while ((line = reader2.readLine()) != null) {
//
//				// um die txt zu speichern - ist ein eindimensionales Array was einfach
//				// mehrzeilig ausgegeben wird?
//				for (int i = 0; i < geschwindigkeit.length; i++) {
//					geschwindigkeit[i] = line.charAt(i);
//				}
//			}
//
//			// werte auslesen
//			int j = 0;
//			for (int i = 0; i < geschwindigkeit.length; i++) {
//				System.out.print(geschwindigkeit[i] + " ");
//				j++;
//				if (j == 40) {
//					System.out.println("");
//					j = 0;
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	static char ausgabewert(double x, double y) {
//		String tempo;
//		int rueckwert;
//	
//		double xKoordinate = (30 - (x*2) -1); 
//		double yKoordinate = (y*2);
//	
//		tempo = geschwindigkeit[(char)xKoordinate][(char)yKoordinate];
//		
//		rueckwert = Integer.parseInt(tempo);
//		
//		return rueckwert;
//		
//		
//}
//
