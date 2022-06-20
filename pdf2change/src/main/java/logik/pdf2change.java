/**
 * 
 */
package logik;

//import java.io.File;
//import java.io.FilenameFilter;

import javax.swing.JOptionPane;


/**
 * @author thomas
 *
 */
public class pdf2change {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Standardwerte für die Parameter setzen
		 * autor
		 * gui
		 * v oder version
		 * debug
		 */		
		String strAutor = "";
		Boolean booleanGui = false;
		Boolean booleanVersion = false;
		String strDateiname;
		Boolean booleanDebug = false; // ausgeschaltet
		
		// Auslesen der Parameter und ggfl. Parameter anpassen
		

		
		version.versionAusgabe();
	
		// Parameter mit der Nummer 0 ist der erste Parameter
		// Parameter mit Leerzeichen müssen mit doppeltem Hochkomma ("") umschlossen werden
		System.out.println("Anzahl der Parameter: " + args.length);

//		Ausgabe aller Parameter
//		for (int i = 0; i < args.length; i++) {
//			System.out.println("Parameter " + i + ": " + args[i]);
//		}
		
//		Ausgabe des aktuellen Verzeichnisses des Programmaufrufs
//		File verzeichnis = new File(".");
//		System.out.println("Das aktuelle Verzeichnis / Programmaufruf-Verzeichnis: " + verzeichnis.getAbsolutePath());

		
		// eigentlicher Programmstart

		
		
		
/*
 * ============== Parameter ind Scan2Pdf =================
 * ================== nach dem Scan=======================
 * Parameter Variablen: {Path}, {Filename}, {Dateiname} Die alte Variable
 * {Dateiname} entspricht dem vollständigem Pfad + Dateiname des Dokuments.
 * Kommen Leerzeichen im Namen vor muss die Variable in doppelte
 * Anführungsstriche gesetzt werden.
 * 
 * Aktuell: Aussehen in Scan2Pdf: "{Path}"\\"{Filename}"
 * 
 * 
 * 
 */		

		
		
/*
 * Parameter auslesen
 */

		
PdfDatei pdfDatei = new PdfDatei();		
		

		
		if (args.length > 0) {
			
			// pdf-Dateiname festlegen
			// letzter Parameter beim Programmaufruf ist der Dateiname mit Endung .pdf oder .tif
			// Aussehen in Scan2Pdf: "{Path}"\\"{Filename}"
			
			// der Programmname beim Programmaufruf ist NICHT der erste Teil der Parameterliste		
			
			// Dateiname
			strDateiname = args[args.length-1];
			
			
			if (strDateiname.endsWith("pdf")) {
				
				switch (args.length) {
				case 1:
					JOptionPane.showMessageDialog(null, "Nachricht\nAnzahl Parameter: " + args.length +
							"\nParameter: " + args[0].toString() +
							"\nDateiname: " +strDateiname);
					pdfDatei.DateiOeffnen(strDateiname);
					break;
	
				case 2:
					JOptionPane.showMessageDialog(null, "Nachricht\nAnzahl Parameter: " + args.length +
							"\nParameter 1: " + args[0].toString() +
							"\nParameter 2: " + args[1].toString() +
							"\nDateiname: " +strDateiname);
	//				pdfDateiOeffnen(strDateiname);
					break;
				
				case 3:
					JOptionPane.showMessageDialog(null, "Nachricht\nAnzahl Parameter: " + args.length +
							"\nParameter 1: " + args[0].toString() +
							"\nParameter 2: " + args[1].toString() +
							"\nParameter 3: " + args[2].toString());				
	//				pdfDateiOeffnen(strDateiname);
					break;
					
				default:
					break;
				}
				
	//			JOptionPane.showMessageDialog(null, "Nachricht\nAnzahl Parameter: " + args.length +
	//					"\nParameter: " + args[0].toString());

				
			} // Ende if: Dateiende pdf?	
				
				
		} else {

			
			
		} // Ende if - else
		
		
		
		
		
		
		
		
		// Block am 22.08.21 auskommentiert
		// zeigt alle Dateien mit der Endung xml im aktuellen Verzeichnis an
		
		/*
		 * File[] dateien = verzeichnis.listFiles(new FilenameFilter() {
		 * 
		 * @Override public boolean accept(File dir, String name) { if
		 * (name.endsWith(".xml")) { return true; } return false; } });
		 * 
		 * for(File f: dateien) { System.out.println("Gefundene Dateien: " +
		 * f.getName()); }
		 * 
		 * Dateiname2Datum d2d = new Dateiname2Datum(); if (d2d.checkJahr("123411s1")) {
		 * System.out.println("Treffer"); } else { System.out.println("Kein Treffer"); }
		 */
	
	}

	
	
	
}
