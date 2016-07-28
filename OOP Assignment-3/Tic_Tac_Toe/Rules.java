package Tic_Tac_Toe;

public class Rules {
	static final int Empty=0;
	static final int ROW=3,COL=3;
	static final int Playing=0;
	static final int Cross_Win=2;
	static final int Naught_Win=3;
	static final int Draw=1;
	
	static final int Cross=1;
	static final int Naught=2;
	
	
	
	/**
	 * it checks valid move 
	 * @param currentRow
	 * @param currentCol
	 * @param board
	 * @param seed
	 * @return boolean
	 */
	public static boolean checkMove(int currentRow,int currentCol,int board[][],int seed ,int playerType){
		if(currentRow>=0 && currentRow<ROW && currentCol>=0 && currentCol<COL && board[currentRow][currentCol]==Empty){
			board[currentRow][currentCol]=seed;
			return false;
		}
		else{
			if(playerType==2 && seed==Naught){
				return true;
			}
			
			System.out.println("Enter a Valid move");
			return true;
		}
	}
	
	/**this method update  move and 
	 * current state
	 * @param seed
	 * @param cRow
	 * @param cCol
	 * @param myBoard
	 * @param currentState
	 * @return currentState
	 */
	public static int updateMove(int seed,int cRow,int cCol,int myBoard[][], int currentState){
			if(hasWon(seed,cRow,cCol,myBoard)){
				return (seed==Cross?Cross_Win:Naught_Win);
				
			}
			else if(isDraw(myBoard)){
				return Draw;
			}
			else{
				return Playing;
			}
	}
	
	//it is checked for winning condition
	public static boolean hasWon(int seed,int cRow,int cCol,int myBoard[][]){
			
			return(myBoard[cRow][0]==seed && myBoard[cRow][1]==seed && myBoard[cRow][2]==seed //conditions of winning
					||myBoard[0][cCol]==seed && myBoard[1][cCol]==seed && myBoard[2][cCol]==seed 
					||cRow==cCol && myBoard[0][0]==seed && myBoard[1][1]==seed && myBoard[2][2]==seed 
					||myBoard[0][2]==seed && myBoard[1][1]==seed && myBoard[2][0]==seed );
				
	}//End hasWon
		
	//isDraw() check draw condtions
	public static boolean isDraw(int myBoard[][]){
			for(int row=0;row<ROW;row++){
				for(int col=0;col<COL;col++){
					if(myBoard[row][col]==Empty){
						return false;
					}					
				}
			}
			return true;
	}//End Draw

}
