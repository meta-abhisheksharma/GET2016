package LinearSearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLinearSearch {

	@Test
	public void test() {
		LinearSearch obj= new LinearSearch();
		assertEquals(-1,obj.linearSearchResult(new int[]{2,5,8,9,10,77,55},0,7,88));
		assertEquals(5,obj.linearSearchResult(new int[]{2,5,8,9,10,77,55},0,7,77));
	}

}
