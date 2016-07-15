package Pyramid2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPyramid2 {

	@Test
	public void test() {
		Pyramid obj=new Pyramid();
		assertArrayEquals(new String[]{"123"," 12","  1"}, new Pyramid().pyramidPrint(3));
	      assertEquals("   ", new Pyramid().space(3)); 
	      assertEquals("1234", new Pyramid().number(4)); 
	       
	}

}
