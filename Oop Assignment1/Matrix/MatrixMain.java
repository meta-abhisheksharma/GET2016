package Matrix;

import java.util.Scanner;

class MatrixOperation{
	/**
	 * addition of two element
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public int[][] addElement(int arr1[][],int arr2[][]){
		
		// checking for valid size
		if(arr1.length<=0 || arr1[0].length<=0 || arr2.length<=0 || arr2[0].length<=0 ){
			System.out.println("Please Enter valid row and coloumn size");
			return null;
		}
		//checking for same dimension
		if(arr1.length != arr2.length && arr1[0].length != arr2[0].length){
			System.out.println("Enter same dimension of array");
			return null;
		}
		int result[][]=new int[arr1.length][arr1[0].length];	//initialize result array
		
		for(int rIndex=0;rIndex<arr1.length;rIndex++){
			for(int cIndex=0;cIndex<(arr1[0].length);cIndex++){
				result[rIndex][cIndex]=arr1[rIndex][cIndex]+arr2[rIndex][cIndex];	//addition of element of array
			}
		}
		return result;
	}
	
	/**transposeMatrix transpose the given
	 * matrix
	 * @param matrix
	 * @return --> transpose matrix
	 */
	public int[][] transposeMatrix(int matrix[][]){
		int trans[][]=new int[matrix[0].length][matrix.length]; 	//transpose matrix
		for(int row=0;row<trans.length;row++){		
			for(int col=0;col<trans[0].length;col++){
				trans[row][col]=matrix[col][row]; 		//logic to transpose matrix form matrix
			}
		}
		return trans;
	}
	
	
	public void printMatrix(int matrix[][]){
		for(int rIndex=0;rIndex<matrix.length;rIndex++){
			for(int cIndex=0;cIndex<(matrix[rIndex].length);cIndex++){
				System.out.print(" "+matrix[rIndex][cIndex]);
			}
			System.out.println();
		}	
	}
	
	/**
	 * matrixMuliplication returns muliply of those
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public int[][] matrixMultiplication(int arr1[][],int arr2[][]){
		if(arr1[0].length==arr2.length){
		int[][] rMatrix=new int[arr1.length][(arr2[0].length)];
		
		for(int rIndex=0;rIndex<rMatrix.length;rIndex++){System.out.println("rIndex"+rIndex);
			for(int cIndex=0;cIndex<(rMatrix[0].length);cIndex++){System.out.println("cIndex:"+cIndex);
				int sum=0;
				for(int index=0;index<rMatrix.length;index++){System.out.println("index:"+index);
				sum=sum+arr1[rIndex][index]*arr2[index][cIndex];
				}
				rMatrix[rIndex][cIndex]=sum;
			}
		}
		
		return rMatrix;
		}
		return null;
	}
		
	
	
}


public class MatrixMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixOperation mat=new MatrixOperation();
		int arr1[][]=getMatrix();
		
		mat.printMatrix(arr1);
		mat.printMatrix(mat.transposeMatrix(arr1));
		int arr2[][]=getMatrix();
		mat.printMatrix(arr2);
		mat.printMatrix(mat.transposeMatrix(arr2));
		int result[][]=mat.addElement(arr1,arr2);
		mat.printMatrix(result);
		
		mat.printMatrix(mat.matrixMultiplication(arr1, arr2));
	}
	
	/**getMatrix generate matrix according
	 * to user dimensions
	 * @return --> 2D matrix
	 */
	public static int[][] getMatrix(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter row:");
		int row=scan.nextInt();
		System.out.print("Enter col");
		int col=scan.nextInt();
		
		//negetive or zero row coloumn condition
		if(row<=0 || col<=0){
			System.out.println("Please Enter valid row and coloumn size");
			getMatrix();
		}
		//Enter matrix element
		int matrix[][]=new int[row][col];
		for(int rIndex=0;rIndex<row;rIndex++){
			for(int cIndex=0;cIndex<col;cIndex++){
				System.out.print("Enter matrix ["+rIndex+"]["+cIndex+"]");
				matrix[rIndex][cIndex]=scan.nextInt();
			}
		}
		
		return matrix;
	}

}
