package LongestSequence;
import java.util.Arrays;

class LongestSequence{
    public int[] LongestSequenceArray(int a[]){
        //initialize of variable
    	int count2=0;
        int first=0;
        int last=0;
        
        for(int i=0;i<a.length;i++){  //for loop for first element
        int count1=1;
        int j=i;
        
        for(;j<a.length-1;j++){   // for loop for find last position of element
            if(a[j]<a[j+1]){
               count1++; 
            }else{
            break;
            }
            }
        
                if(count1>count2){  // changing the first and last if next count is large than previous one
                    count2=count1;
                    first=i;
                    last=j;
                }
            i=j;
        
    }
        for(int i=first;i<=last;i++){
            System.out.print(a[i]);
        }
        return Arrays.copyOfRange(a, first, last) ; // for return the sub part of array which is longest
    }
}

public class MainLongestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[]=new LongestSequence().LongestSequenceArray(new int[]{1,2,3,1,2,3,4,1,2,3,4,5});
	}

}
