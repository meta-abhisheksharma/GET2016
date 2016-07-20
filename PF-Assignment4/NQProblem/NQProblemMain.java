package NQProblem;

import java.util.Scanner;

class NQueenProblem{
	//final static int N=4;
	
	/**prints solution of queen problen
	 * 
	 * @param board-->2d matrix
	 */
	public void printSolution(int board[][],int dimension){
		for(int row=0;row<dimension;row++){
			for(int col=0;col<dimension;col++){
				System.out.print("  "+board[row][col] );
				
			}
			System.out.println();
		}
	}
	
	
	/**function for finding safe place for queen
	 * 
	 * @param board
	 * @param row
	 * @param col
	 * @param dimension
	 * @return true or false
	 */
	public boolean safePlace(int board[][],int row,int col,int dimension){
		
		//check for row at left
		
		for(int index=0;index<col;index++){
			if(board[row][index]==1){
				return false;
			}
		}
		
		//check for upper diagonal
		for(int index1=row , index2=col; index1>=0 && index2>=0; index1--,index2-- ){
			if(board[index1][index2]==1){
				return false;
			}
		}
		
		//check for lower diagonal
		for(int index1=row , index2=col; index2>=0 && index1<dimension; index1++,index2--){
			if(board[index1][index2]==1){
				return false;
			}
		}
		
		return true;
	}
	public boolean getQueenSolution(int board[][],int col,int dimension){
		
		//Exception handling for negetive dimensions
		if(dimension<=0){
			System.out.print("Please Enter Valid dimension");
			return false;
		}
		//all coloumn has been traversed
		if(col>=dimension){
			return true;
		}
		for(int row=0;row<dimension;row++){
			//checking safe place condition
			if(safePlace(board,row,col,dimension)){
				board[row][col]=1;
				//check for furture getQueenSolution for checking place
				if(getQueenSolution(board,col+1,dimension)){
					return true;
				}
				//backtraking condition
				board[row][col]=0;
			}
			
		}
		//if solution not found
		return false;
	}
	
	/**
	 * queenSolution accept size nd return solution String
	 * @param board
	 * @param col
	 * @param dimension
	 * @return string[]
	 */
	public String[] queenSolution(int board[][],int col,int dimension){
		
		if(getQueenSolution(board,col,dimension)==false){	//if solution not found
			System.out.println("Solution Doesn,t found");
			return null;
		}
		
		String str[]=new String[dimension];
		for(int index=0;index<dimension;index++){
			str[index]="";
		}
		
		for(int row=0;row<dimension;row++){
			for(int index=0;index<dimension;index++){
				
				str[row] =str[row]+""+board[row][index];
				
			}
			
		}
		return str;
		
	}
}
public class NQProblemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueenProblem obj=new NQueenProblem();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Dimension of matrix :");
		int dimension=scan.nextInt();
		//Exception handling when dimension not valid
		if(dimension<=0){
			System.out.println("Please Enter Valid Dimension");
			System.exit(1);
		}
		
		//board array-2-D
		int board[][]=new int[dimension][dimension];
		
		for(int row=0;row<dimension;row++){
			for(int col=0;col<dimension;col++){
				board[row][col]=0;
			}
		}
		
		
		//int board[][]=new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		if(obj.getQueenSolution(board,0,dimension)==false){
			System.out.println("Solution Doesn,t found");
			System.exit(1);
		}
		scan.close();
		
		//printion solution
		obj.printSolution(board,dimension);
	}

}
