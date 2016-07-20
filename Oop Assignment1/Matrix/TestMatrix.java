package Matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMatrix {

	@Test
	public void test() {
		MatrixOperation obj=new MatrixOperation();
		int arr[][]={{1,2,3},{4,5,6}};
		assertArrayEquals(new int[][]{{1,4},{2,5},{3,6}},obj.transposeMatrix(arr) );
		int arr1[][]={{1,2},{1,2}};
		int arr2[][]={{1,2},{1,2}};
		assertArrayEquals(new int[][]{{2,4},{2,4}},obj.addElement(arr1, arr2) );
		assertArrayEquals(new int[][]{{3,6},{3,6}},obj.matrixMultiplication(arr1, arr2));
	}

}
