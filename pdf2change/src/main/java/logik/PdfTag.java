/**
 * 
 */
package logik;

import java.util.Calendar;

// 13.02.2022: nach github
// bis jetzt gescheitert


/**
 * @author thomas
 *
 * Klasse, die die Tags aus ByMeta darstellt
 *
 */
public class PdfTag {

//https://pdfbox.apache.org/docs/2.0.13/javadocs/	
	
String strVerfasser;
String strTitel;
String strStichwoerter;
String strThema;

Calendar calErzeugtAm;
	



public String getStrVerfasser() {
	return strVerfasser;
}


public void setStrVerfasser(String strVerfasser) {
	this.strVerfasser = strVerfasser;
}


public String getStrTitel() {
	return strTitel;
}


public void setStrTitel(String strTitel) {
	this.strTitel = strTitel;
}


public String getStrStichwoerter() {
	return strStichwoerter;
}


public void setStrStichwoerter(String strStichwoerter) {
	this.strStichwoerter = strStichwoerter;
}


public String getStrThema() {
	return strThema;
}


public void setStrThema(String strThema) {
	this.strThema = strThema;
}


public Calendar getCalErzeugtAm() {
	return calErzeugtAm;
}


public void setCalErzeugtAm(Calendar calErzeugtAm) {
	this.calErzeugtAm = calErzeugtAm;
}


/**
 * <p>Konstruktor</p>
 * <p>Tag-Daten werden aus einer pdf-Datei gelesen</p>
 * <li>Titel: <b>String</b></li>
 * <li>Stichwörter: <b>getKeywords()</b></li>
 * <li>Thema: <b>getSubject()</b></li>
 * <li>Verfasser: <b>getAuthor()</b></li>
 * <li>Erstellt am: <b>setCreationDate(Calendar date)</b></li>
 * <li>Geändert am: <b>setModificationDate(Calendar date)</b></li>
 * <li>Erzeugt mit: <b>getProducer()</b></li>
 * <p>Unklar:
 * <li>getTrapped()</li>
 * <li>getCreator</li>
 * </p>
 */
public PdfTag() {
	strVerfasser = "";
	strTitel ="";
	strStichwoerter ="";
	strThema ="";
	
	calErzeugtAm = Calendar.getInstance();
}


/**
 * @param strPdfDateiname
 */
public void TagsAusDateinameErzeugen(String strPdfDateiname) {
	
}


/**
 * 
 */
public void TagsLeeren() {
	
}


/**
 * @param strName
 */
public Calendar TagDatumAusStringErzeugen(String strName) {
	Calendar calAusString = Calendar.getInstance();
	
	// die ersten 4 Zeichen des String
	calAusString.set(Calendar.YEAR, Integer.parseInt(strName.substring(0, 4)));
//	System.out.println("Jahr (String): " + strName.substring(0, 4));
//	System.out.println("Jahr (int): " + Integer.parseInt(strName.substring(0, 4)));
	
	
	// erster Monat eines Jahres = Januar = 0 (und nicht EINS!)
	calAusString.set(Calendar.MONTH, Integer.parseInt(strName.substring(5).substring(0, 2))-1);
//	System.out.println("Monat (String): " + strName.substring(5).substring(0, 2));
//	System.out.println("Monat (int): " + Integer.parseInt(strName.substring(5).substring(0, 2)));
	
	calAusString.set(Calendar.DAY_OF_MONTH, Integer.parseInt(strName.substring(5).substring(3).substring(0, 2)));
//	System.out.println("Tag (String): " + strName.substring(5).substring(3).substring(0, 2));
//	System.out.println("Tag (int): " + Integer.parseInt(strName.substring(5).substring(3).substring(0, 2)));
	
	return calAusString;
	
}

}
