package Paramid;

import java.util.Scanner;

class PyramidCreate{
    
    /**this method create pyramid array to draw pattern
     * according to pyramid size
     * @param paraSize it defines pyramid size
     * @return it return string array which contain pyramid
     */
    String[] pyramidMethod(int paraSize){
        
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
    String space(int i,int paraSize){  //method for space string
        String temp="";     //it is temporary variable to store space
        for(int j=1;j<=paraSize-i;j++){
            temp=temp+" ";
        }
        return temp;
    }
    /**number method provide number string 
     * according to row
     * @param i it defines number of element which will print
     * @return it returns number string
     */
    
    String number(int i){   
        String temp="";  //it is temporary variable to store space
        int j=1;
        
        for(;j<=i;j++){
            temp=temp+j;
        }
        
        for(int k=j-2;k>=1;k--){
            temp=temp+k;
        }
        return temp;
    }
}
public class ParamidClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
	       //int n=scan.nextInt();
	       String b[]=new PyramidCreate().pyramidMethod(5);
	       for(int i=0;i<b.length;i++)
	       {
	           System.out.println(b[i]);
	       }
	}

}
