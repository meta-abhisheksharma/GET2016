package BinarySearchRecursive;

import static org.junit.Assert.assertEquals;

import org.junit.Test;





public class TestBinarySearch {

	@Test
	public void test() {
		BinarySearch obj=new BinarySearch();
		assertEquals(-1,obj.binarySearchResult(new int[]{2,5,8,9,10,77,55},0,6,88));
		assertEquals(5,obj.binarySearchResult(new int[]{2,5,8,9,10,77,55},0,6,77));
	}

}
