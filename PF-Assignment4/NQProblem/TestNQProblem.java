package NQProblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNQProblem {

	@Test
	public void test() {
		NQueenProblem obj=new NQueenProblem();
		String str[]={"0010","1000","0001","0100"};
		int board[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		
		int board1[][]={{0,0},{0,0}};
		
		assertArrayEquals(str, obj.queenSolution(board, 0,4));
		assertArrayEquals(null, obj.queenSolution(board1, 0,2));
	}

}
