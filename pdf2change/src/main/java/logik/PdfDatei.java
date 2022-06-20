package logik;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

/**
 * @author thomas
 * 
 * <p>Alles rund um eine pdf-Datei</p>
 * <li>Check, ob vorhanden</li>
 * <li>Datei zum Schreiben öffen</li>
 * <li>Datei zum Lesen öffen</li>
 * 
 */
public class PdfDatei {
	
	
	/**
	 * @param strDateiname (Typ: String)
	 * 
	 * <p>Öffnet eine pdf-Datei und schreibt dann pdf-Tags</p>
	 */
	public void DateiOeffnen(String strDateiname) {

		try {
			
			PDDocument pdfDokument = PDDocument.load((new File(strDateiname)));
			
			PDDocumentInformation pdfInfo = new PDDocumentInformation();
			
//			System.out.println("Autor: " + pdfDokument.getDocumentInformation().getAuthor());
//			System.out.println("Jahr: " + pdfDokument.getDocumentInformation().getCreationDate().get(Calendar.DAY_OF_MONTH));
			
//			KalenderFunktionen kal = new KalenderFunktionen();
			
			// kann auch leer bzw. NULL sein --> Exception abfangen !!
//			kal.fktDatumWandeln(pdfDokument.getDocumentInformation().getCreationDate());
			
//			System.out.println("Autor: " + pdfInfo.getAuthor());
			
//			pdfInfo.setTitle("Erzeugter Titel");
			pdfInfo.setAuthor("Thomas");
//			pdfInfo.setProducer("Erzeugt von Thomas mit Java-Programm");

//			pdfInfo.setCreationDate(datum);

			//aktuelles Datum
//			Calendar calDatum = Calendar.getInstance();
			
//			kal.fktDatumWandeln1("2020-10-09");
			
//			calDatum.set(Calendar.YEAR, 2000);
			
//			pdfInfo.setCreationDate(calDatum);
//			pdfInfo.setCreationDate(kal.fktDatumWandeln("2016-05-10-heinrich-düp25.pdf"));
			
			
			pdfDokument.setDocumentInformation(pdfInfo);

			pdfDokument.save(new File(strDateiname));

			
		
		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "pdf-Datei wurde nicht gefunden");
			e.printStackTrace();
		}
		
		
	} // Ende pdfDateiOeffnen
}
