package TowerOfHanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTOH {

	@Test
	public void test() {
		TowerOfHanoiSolution obj=new TowerOfHanoiSolution();
		assertArrayEquals(new String[]{"A-->C","A-->B","C-->B","A-->C","B-->A","B-->C","A-->C"},obj.getTOHSolution(3,"A","B","C",new String[7]));
		assertArrayEquals(null,obj.getTOHSolution(0,"A","B","C",new String[0]));
	}

}
