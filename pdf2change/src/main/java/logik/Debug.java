package logik;

import javax.swing.JOptionPane;

/**
 * @author thomas
 * 
 * <p>Der Konstruktor benötigt zwingend die Angabe<p>
 * <p>des Debug-Status: <b>booleanDebug<b><p>
 *
 *
 */
public class Debug {

	
	private Boolean booleanDebug = false;
	
	
	/**
	 * @param booleanDebug
	 */
	public Debug(Boolean booleanDebug) {

	}


	public Boolean getBooleanDebug() {
		return booleanDebug;
	}


	public void setBooleanDebug(Boolean booleanDebug) {
		this.booleanDebug = booleanDebug;
	}
	
	
	public void debugInfoFenster(String strInfo) {
		
		if (booleanDebug) {
			JOptionPane.showMessageDialog(null, strInfo, "Info Fenster", 0);
		}
		
		
	}
	
	
}
