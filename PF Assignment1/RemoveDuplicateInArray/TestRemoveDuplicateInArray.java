package RemoveDuplicateInArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemoveDuplicateInArray {

	@Test
	public void test() {
		assertArrayEquals(new int[]{1, 2,4,5,6,7,8,9},new RemoveDuplicateInArray().removeDuplicate(new int[]{1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9}));
	}

}
