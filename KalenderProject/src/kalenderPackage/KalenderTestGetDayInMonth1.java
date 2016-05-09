package kalenderPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class KalenderTestGetDayInMonth1 {
	Kalender tester = new Kalender();
	@SuppressWarnings("static-access")
	@Test
	public void test30() {
		assertEquals(30,tester.getDaysInMonth1(4));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test31() {
		assertEquals(31,tester.getDaysInMonth1(5));		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test28(){
		assertEquals(28,tester.getDaysInMonth1(2));
	}
}
