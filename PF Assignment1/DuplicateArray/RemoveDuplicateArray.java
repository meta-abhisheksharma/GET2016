package DuplicateArray;

import java.util.Arrays;

class  RemoveDuplicateInArray{
	public int[] removeDuplicateInArrayMethod(int a[]){
		int size=a.length;
		int b[]=new int[size];
		int duplicate=0;
		
		for(int i=0;i<size;i++){
			int temp=a[i];
			int j=0;
			for(;j<size;j++){
				if(temp==b[j]){ //comparing for same element and increase duplicate variable
					duplicate++;
					break;
					
				}
			}
			if(j==size){
				b[i]=temp;
			}
		
		}
		for(int i=0;i<size-duplicate+1;i++){
			System.out.print(b[i]);
		}System.out.println();
		for(int i:Arrays.copyOfRange(b, 0, size-duplicate+1))
		System.out.print(i);
		 return Arrays.copyOfRange(b, 0, size-duplicate+1) ;
		}
	
}


public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateInArray ob=new RemoveDuplicateInArray();
		ob.removeDuplicateInArrayMethod(new int[]{2,5,4,6,3,8,5,9,3,3,6,3,9,0});
	}

}
