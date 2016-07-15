package Pyramid2;

import java.util.Scanner;

class Pyramid{
    
    /**this method create pyramid array to draw pattern
     * according to pyramid size
     * @param n it defines pyramid size
     * @return it return string array which contain pyramid
     */
    public String[] pyramidPrint(int n){
    	if(n<=0){		//handling of negetive number and zero
    		System.out.println("Please Enter Positive and non Zero Number");
    		System.exit(1);
    	}
        String prmd[]=new String[n]; //pyramid array
        
        for(int row=0;row<prmd.length;n--,row++){          //loop for create paramid string
             prmd[row]=space(row)+number(n);            //append both space and number space
        }
        return prmd;
    }
    
    /**space method provide space string
     * according to row
     * @param i it define row which used to calculate space
     * @return it returns space string
     */
    String space(int row){       //space string
        String temp="";         //temporary variable to store space
        
        for(;row>=1;row--){
            temp=temp+" ";
        }
        return temp;
    }
    
    /**number method provide number string 
     * according to row
     * @param n it defines number of element which will print
     * @return it returns number string
     */
    String number(int size){   //number string
        String temp="";     //temporary variable to store space
        int row=1;
        for(;row<=size;row++){
            temp=temp+row;
        }
        return temp;
    }
}

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	      int n=scan.nextInt();
	      
	       String resultArr[]=new Pyramid().pyramidPrint(n);
	       for(int row=0;row<resultArr.length;row++)
	       {
	           System.out.println(resultArr[row]);
	       }
	       scan.close();
	}

}
