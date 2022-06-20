/**
 * 
 */
package logik;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Thomas
 *
 */
class dateiname2datumTest {

	/**
	 * Test method for {@link logik.Dateiname2Datum#checkJahr(java.lang.String)}.
	 */

	/* Die ersten vier Stellen müssen Zahlen sein, wobei
	 * die beiden ersten Stellen entweder: 18, 19 oder 20 sein müssen
	 */
	@Test
	@DisplayName("Test: Jahr: jjjj")
	void testCheckJahr() {
		
		Dateiname2Datum dateiname = new Dateiname2Datum();
		
		Assert.assertFalse("Fehler einstelliges Jahr bzw. Ziffer", dateiname.checkJahr("1"));
		Assert.assertFalse(dateiname.checkJahr("0"));
		Assert.assertFalse(dateiname.checkJahr("18"));
		Assert.assertFalse(dateiname.checkJahr("190"));
		Assert.assertFalse(dateiname.checkJahr("1230"));
		assertTrue(dateiname.checkJahr("1900"));
		assertTrue(dateiname.checkJahr("1900-12-12-asdfASD"));
		
		Assert.assertFalse(dateiname.checkJahr("1712"));
		assertTrue(dateiname.checkJahr("1800"));
		assertTrue(dateiname.checkJahr("1900"));
		assertTrue(dateiname.checkJahr("2000"));
		Assert.assertFalse(dateiname.checkJahr("2100"));

		
		assertEquals("test-assert", true, dateiname.checkJahr("2000"));
		
		assertTrue(dateiname.checkJahr("2000asd"));
		assertTrue(dateiname.checkJahr("1900-12-3asd12_Df12-asd23"));
		
		//		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Test: Jahr-Monat: jjjj-mm")
	void testCheckJahrMonat() {
		
		Dateiname2Datum dateiname = new Dateiname2Datum();
		
		Assert.assertFalse("Fehler einstelliges Jahr bzw. Ziffer", dateiname.checkJahrMonat("1"));
		Assert.assertTrue("yyyy-mm Fehler", dateiname.checkJahrMonat("1900-12-asd"));
		Assert.assertTrue("yyyy-mm Fehler", dateiname.checkJahrMonat("1900-02-asd"));
}

	
	@Test
	@DisplayName("Test: Jahr-Monat-Tag: jjjj-mm-tt")
	void testCheckJahrMonatTag() {
		
		Dateiname2Datum dateiname = new Dateiname2Datum();
		Assert.assertFalse("Fehler einstelliges Jahr bzw. Ziffer", dateiname.checkJahrMonatTag("1"));
		Assert.assertTrue("yyyy-mm Fehler", dateiname.checkJahrMonatTag("1900-12-01-asd"));
		Assert.assertTrue("yyyy-mm Fehler", dateiname.checkJahrMonatTag("2000-08-31-asd"));
}

	
	
}
