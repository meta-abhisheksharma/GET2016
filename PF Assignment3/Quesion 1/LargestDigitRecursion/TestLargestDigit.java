package LargestDigitRecursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLargestDigit {

	@Test
	public void test() {
		LargestDigit obj=new LargestDigit();
		assertEquals(2,obj.largestDigitCal(2));
		assertEquals(9,obj.largestDigitCal(1257369));
		assertEquals(4,obj.largestDigitCal(444));
	}

}
