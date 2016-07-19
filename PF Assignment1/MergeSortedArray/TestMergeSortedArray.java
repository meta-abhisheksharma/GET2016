package MergeSortedArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMergeSortedArray {

	@Test
	public void test() {
		assertArrayEquals(new int[]{1,2,4,5,6,7,8}, new MergeSortedArray().mergeArray(new int[]{1,4,6,7}, 4,new int[]{2,5,8},3));
	}

}
