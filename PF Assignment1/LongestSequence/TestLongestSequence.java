package LongestSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLongestSequence {

	@Test
	public void test() {
		assertArrayEquals(new int[]{1,2,3,4,5}, new LongestSequence().LongestSequenceArray(new int[]{1,2,3,1,2,3,4,1,2,3,4,5}));
	}

}
