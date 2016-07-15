package Paramid;

import java.util.Scanner;

class PyramidCreate{
    
    /**this method create pyramid array to draw pattern
     * according to pyramid size
     * @param paraSize it defines pyramid size
     * @return it return string array which contain pyramid
     */
    String[] pyramidPrint(int paraSize){
    	if(paraSize<=0){		//handling of negetive number
    		System.out.println("Please Enter Positive and non Zero Number");
    		System.exit(1);
    	}
        
        String prmd[]=new String[(2*paraSize)-1]; //pyramid String array
        
        int rowNo=1;
        
        for(;rowNo<=paraSize;rowNo++){          //loop for forward printing
             prmd[rowNo-1]=space(rowNo,paraSize)+number(rowNo);
        }
        rowNo=rowNo-2;
        
        for(;rowNo>=1;rowNo--){         // loop for reverse printing
               prmd[2*paraSize-rowNo-1]=space(rowNo,paraSize)+number(rowNo);
        }
        return prmd;
    }
    
    /**space method provide space string
     * according to row
     * @param i it define row no
     * @param paraSize it define pyramid size , both i and parasize is used to calculate space
     * @return it returns space string
     */
    String space(int row,int paraSize){  //method for space string
        String temp="";     //it is temporary variable to store space
        for(int col=1;col<=paraSize-row;col++){
            temp=temp+" ";
        }
        return temp;
    }
    /**number method provide number string 
     * according to row
     * @param i it defines number of element which will print
     * @return it returns number string
     */
    
    String number(int row){   
        String temp="";  //it is temporary variable to store space
        int col=1;
        
        for(;col<=row;col++){
            temp=temp+col;
        }
        
        for(int index=col-2;index>=1;index--){
            temp=temp+index;
        }
        return temp;
    }
}
public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	       int size=scan.nextInt();
	       String resultArr[]=new PyramidCreate().pyramidPrint(size);
	       for(int row=0;row<resultArr.length;row++)
	       {
	           System.out.println(resultArr[row]);
	       }
	}

}
