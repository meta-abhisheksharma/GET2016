package Tic_Tac_Toe;

import java.lang.management.PlatformManagedObject;
import java.util.Random;
import java.util.Scanner;

public class Tic_Tac_Toe_Main {
	static final int Empty=0;
	static final int Cross=1;
	static final int Naught=2;
	static final int Playing=0;
	static final int Cross_Win=2;
	static final int Naught_Win=3;
	static final int Draw=1;
	static final int ROW=3,COL=3;
	static int currentState;
	static int currentPlayer;
	static int myBoard[][]=new int[ROW][COL];
	static int currentRow,currentCol;
	static int playerType;
	static Scanner scan=new Scanner(System.in);
	//Rules objRule=new Rules();
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Board board=new Board();
		myBoard= board.getBoard();
		boolean playerInvalid=false;
		
		do{			
		playerInvalid=false;
		System.out.println("Enter 1 for Human Players and 2 for computer player");
		
		playerType=scan.nextInt();
		if(playerType != 1 && playerType != 2)		//condition where user is not valid
		{
			System.out.println("Enter Valid Players");
			playerInvalid=true;
		}
		}while(playerInvalid);
		
		currentState=Playing;
		currentPlayer=Cross;
		
		do{
		
		takeInput(currentPlayer);		
		currentState=Rules.updateMove(currentPlayer,currentRow,currentCol,myBoard,currentState);
		DisplayBoard.printMove(myBoard);
		
		
		if(currentState==Cross_Win){	//when cross player is win
			System.out.println("Cross Win");
		}
		else if(currentState==Naught_Win){	//when naught player is win
			System.out.println("Naught Win");
		}
		else if(currentState==Draw){	//draw occur
			System.out.println("Draw");
		}
		
		currentPlayer=(currentPlayer==Cross?Naught:Cross);
		}while(currentState==Playing);

	}
	
	
	/**this method take
	 * input and check put value
	 * @param seed is cross or naught
	 */
	static void takeInput(int seed){
		
		if(playerType==1){
		
		boolean inValid=false;
		do{
			inValid=false;
		if(seed==Cross){
			System.out.print("Player 'X' Enter Position from [1-3] [1-3]--");
		}
		else{
			System.out.print("Player 'O' Enter Position from [1-3] [1-3]--");
		}
		
			currentRow=scan.nextInt()-1;
			currentCol=scan.nextInt()-1;
			inValid=Rules.checkMove(currentRow, currentCol, myBoard, seed,playerType);
			
		}while(inValid);
		}
		
		//code for machine player
		else{
			boolean inValid=false;
			do{
				inValid=false;
			if(seed==Cross){
				System.out.print("Player 'X' Enter Position from [1-3] [1-3]--");
				currentRow=scan.nextInt()-1;
				currentCol=scan.nextInt()-1;
				System.out.println("currentRow="+currentRow);
				System.out.println("currentCol="+currentCol);
			}
			else{
				currentRow=(int)(Math.random()*3);
				currentCol=(int)(Math.random()*3);
				
			}
			
				
				inValid=Rules.checkMove(currentRow, currentCol, myBoard, seed,playerType);
				
			}while(inValid);
		}
	}//End takeInput
	
	
	
}