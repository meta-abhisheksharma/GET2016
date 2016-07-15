package Pyramid2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPyramid2 {

	@Test
	public void test() {
		 assertArrayEquals(new String[]{"321"," 21","  1"}, new SecondPyramid().pyramidMethod(3));
	        assertEquals("  ",new SecondPyramid().space(2));
	        assertEquals("54321",new SecondPyramid().number(5));
	}

}
