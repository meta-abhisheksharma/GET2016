package GreatestCommonDivision;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGCDClass {

	@Test
	public void test() {
		GCD obj=new GCD();
		assertEquals(1,obj.GCDCalculate(2, 1) );
		assertEquals(6,obj.GCDCalculate(12, 18) );
		assertEquals(1,obj.GCDCalculate(100, 3) );
	}

}
