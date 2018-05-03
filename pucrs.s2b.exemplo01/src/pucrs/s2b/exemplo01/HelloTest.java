package pucrs.s2b.exemplo01;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testSomar() {
		
		int expected=50;
		int actual=Hello.somar(30,20);
		assertEquals(expected, actual);
		
	}
	@Test 
	public void testSomar2() {
		
		assertEquals(0, Hello.somar(0, 0));
		
	}

}
