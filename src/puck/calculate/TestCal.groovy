package puck.calculate;

import static org.junit.Assert.*

import org.junit.Test

class TestCal {

	@Test
	public void test() {
		println 13.intdiv(5)
	}
	
	@Test
	public void testBig() {
		BigDecimal bd = new BigDecimal(2);
		
		println bd.multiply(4).toString()
	}
}
