package Paramid;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestParamid {

	@Test
	public void test() {
		PyramidCreate obj=new PyramidCreate();
		assertArrayEquals(new String[]{"  1"," 121","12321"," 121","  1"}, obj.pyramidPrint(3));
        assertEquals(" ",obj.space(2, 3));
        assertEquals("121",obj.number(2));
	}

}
