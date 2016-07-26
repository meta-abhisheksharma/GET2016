package Tic_Tac_Toe;

public class DisplayBoard {
	static final int ROW=3,COL=3;

//method to print tic tac toe board 's move
	static void printMove(int board[][]){
		for(int row=0;row<ROW ;row++)
		{
			for (int col=0;col<COL;col++)
			{
				printCell(board[row][col]);

				if(col!=COL-1)
				{
					System.out.print("|");
				}
			}
			if(row!=ROW-1){
				System.out.println("");
			}
		}
		System.out.println();
	}
	
	static void printCell(int content){
		switch(content){
		case 0 :System.out.print(" "); break;
		case 1 :System.out.print("X"); break;
		case 2 :System.out.print("O"); break;
		}
	}
}
