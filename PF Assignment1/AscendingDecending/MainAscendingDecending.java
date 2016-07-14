package AscendingDecending;

class AscendingDecending{
    public int checkAscendingDecending(int a[]){
        int count1=0,count2=0; // initialize count for fint longest sequence
        
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1])    // condition for ascending
            {
                count1++;
            }
            else{				// condition for decending
                count2++;
            }
        }
        if(count1==a.length-1){  
            return 1;
        }
        else if(count2==a.length-1){
        return 2;
    }
        else{
                return 0;
                }
        
    }
}
public class MainAscendingDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= new AscendingDecending().checkAscendingDecending(new int[]{4,3,2,1});
	       System.out.println(i);
	}

}
