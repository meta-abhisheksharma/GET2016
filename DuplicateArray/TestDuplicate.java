package DuplicateArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDuplicate {

	@Test
	public void test() {
		assertArrayEquals(new int[]{2,5,4,6,3,8,0,9}, new RemoveDuplicateInArray().removeDuplicateInArrayMethod(new int[]{2,5,4,6,3,8,5,9,3,3,6,3,9,0}));
	}

}
