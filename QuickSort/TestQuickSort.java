package QuickSort;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuickSort {

	@Test
	public void test() {
		QuickSort obj =new QuickSort();
		int arr1[]=new int[] {2,5,8,9,10, 77, 55, 11};
		assertArrayEquals(new int[]{2,5,8,9,10,11,55,77},obj.quickSortResult(arr1,0,arr1.length-1));
		int arr2[]=new int[]{};
		assertArrayEquals(null,obj.quickSortResult(arr2,0,arr2.length-1));
	}

}
