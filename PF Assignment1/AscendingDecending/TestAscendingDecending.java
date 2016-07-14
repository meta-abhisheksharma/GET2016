package AscendingDecending;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAscendingDecending {

	@Test
	public void test() {
		assertArrayEquals(new int[]{2},new int[]{new AscendingDecending().checkAscendingDecending(new int[]{4,3,2,1})});
		
	}

}
