package kalenderPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class KalenderTestCheck_date {
	
	Kalender tester = new Kalender();
	
	@SuppressWarnings("static-access")
	@Test
	public void testNoLeapYear() {
		assertTrue(tester.check_date(29, 2, 2016));	
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testLeapYear() {		
		assertFalse(tester.check_date(29, 2, 2015));	
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testNegativeValue() {
		assertFalse(tester.check_date(-1, -2, 2016));
		assertFalse(tester.check_date(1, -2, 2016));	
		assertTrue(tester.check_date(1, 2, -2016));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testOutOfRange(){
		assertFalse(tester.check_date(32, 1, 2016));
		assertFalse(tester.check_date(32, 2, 2016));
		assertFalse(tester.check_date(31, 2, 2016));
		assertFalse(tester.check_date(30, 2, 2016));
	}
}
