package Pyramid2;

import java.util.Scanner;

class SecondPyramid{
    
    /**this method create pyramid array to draw pattern
     * according to pyramid size
     * @param n it defines pyramid size
     * @return it return string array which contain pyramid
     */
    public String[] pyramidMethod(int n){
        String prmd[]=new String[n]; //pyramid array
        
        for(int j=0;j<prmd.length;n--,j++){          //loop for create paramid string
             prmd[j]=space(j)+number(n);            //append both space and number space
        }
        return prmd;
    }
    
    /**space method provide space string
     * according to row
     * @param i it define row which used to calculate space
     * @return it returns space string
     */
    String space(int i){       //method for space string
        String temp="";         //it is temporary variable to store space
        
        for(;i>=1;i--){
            temp=temp+" ";
        }
        return temp;
    }
    
    /**number method provide number string 
     * according to row
     * @param n it defines number of element which will print
     * @return it returns number string
     */
    String number(int n){   //method for number string
        String temp="";     //it is temporary variable to store space
        
        for(;n>=1;n--){
            temp=temp+n;
        }
        return temp;
    }
}

public class MainPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
	      // int n=scan.nextInt();
	       String b[]=new SecondPyramid().pyramidMethod(5);
	       for(int i=0;i<b.length;i++)
	       {
	           System.out.println(b[i]);
	       }
	}

}
