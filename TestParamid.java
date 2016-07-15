package Paramid;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestParamid {

	@Test
	public void test() {
		assertArrayEquals(new String[]{"  1"," 121","12321"," 121","  1"}, new PyramidCreate().pyramidMethod(3));
        assertEquals(" ",new PyramidCreate().space(2, 3));
        assertEquals("121",new PyramidCreate().number(2));
	}

}
