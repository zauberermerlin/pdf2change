/**
 * 
 */
package logik;

/**
 * @author thomas
 *
 */
public class Dateiname2Datum {

	
/**
 * @param strDateiname
 * @return Boolean
 * 
 * <p>Überprüft, ob die ersten 4 Zeichen Ziffern sind, wobei</p>
 * <li>die erste Ziffer eine "1" oder "2" sein muss</li>
 * <ol> wenn die erste Ziffer eine "1", dann muss die zweite Ziffer
 * eine "8" oder "9" sein</ol>
 */
Boolean checkJahr(String strDateiname) {
	return strDateiname.matches("([1][8-9]|[2][0])[0-9][0-9][a-zA-Z0-9_\\-]*");
}
	

/**
 * @param strDateiname
 * @return Boolean
 */
Boolean checkJahrMonat(String strDateiname) {
	return strDateiname.matches("([1][8-9]|[2][0])[0-9][0-9]\\-([0][0-9]|[1][0-2])[a-zA-Z0-9_\\-]*");
}


/**
 * @param strDateiname
 * @return Boolean
 */
Boolean checkJahrMonatTag(String strDateiname) {
	return strDateiname.matches("([1][8-9]|[2][0])[0-9][0-9]\\-([0][0-9]|[1][0-2])\\-([0-2][0-9]|[3][0-1])[a-zA-Z0-9_\\-]*");
}



/**
 * @param strDateiname
 * @return String
 */
String jahr2Datum(String strDateiname) {
	
	/* 
	 * Überprüfung, ob die ersten 4 Stellen Ziffern in dem Bereich 1900 bis 2999 sind
	 * wenn ja, dann wird der Wert als Datum genommen
	 */
	
	
	return "2012";
}


}
