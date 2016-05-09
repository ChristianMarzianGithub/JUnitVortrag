package kalenderPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class KalenderTestConvertDate1 {

	@Test
	public void negativeValues() {
		assertEquals("Monat bzw. Tag ist negativ",Kalender.convertDate1(-1, 2, 2016));
		assertEquals("Monat bzw. Tag ist negativ",Kalender.convertDate1(1, -2, 2016));
	}
	
	@Test
	public void outOfRange() {
		assertEquals("29 Februar 2016",Kalender.convertDate1(29, 2, 2016));
	}
	
	@Test
	public void test(){
		assertEquals("Tag oder Monat zu klein/groﬂ",Kalender.convertDate1(31, 2, 2016));
	}
	
	@Test
	public void test1(){
		assertEquals("Tag oder Monat zu klein/groﬂ",Kalender.convertDate1(30, 2, 2016));
	}
	
	@Test
	public void test2(){
		assertEquals("Tag oder Monat zu klein/groﬂ",Kalender.convertDate1(4, 0, 2013));
	}
	
	@Test
	public void test3(){
		assertEquals("Tag oder Monat zu klein/groﬂ",Kalender.convertDate1(0, 2, 2013));
	}
	
	@Test
	public void test4(){
		assertEquals("Tag oder Monat zu klein/groﬂ",Kalender.convertDate1(29, 2, 2013));
	}
	
	
	
	
	@Test
	public void normalBehaviour(){
		assertEquals("10 Mai 2016",Kalender.convertDate1(10, 5, 2016));
		assertEquals("21 Juni 1914",Kalender.convertDate1(21, 6, 1914));
	}
}