package kalenderPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class KalenderTestGetDaysInMonth2 {
	Kalender tester = new Kalender();
	
	@SuppressWarnings("static-access")
	@Test
	public void test30() {			
			assertEquals(30,tester.getDaysInMonth2(4,2013));	
	}

	@SuppressWarnings("static-access")
	@Test
	public void test31() {			
			assertEquals(31,tester.getDaysInMonth2(5,2016));	
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test28() {			
		assertEquals(28,tester.getDaysInMonth2(2,2015));	
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test29() {			
		assertEquals(29,tester.getDaysInMonth2(2,2016));	
	}
	
}
