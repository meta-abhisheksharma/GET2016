import static org.junit.Assert.*;

import org.junit.Test;


public class TestBinaryToOctalClass {

	@Test
	public void testBinaryToOctal() {
		assertEquals(65,new BinaryToOctalClass().convertBinaryToOctal(110101));
	}

}
