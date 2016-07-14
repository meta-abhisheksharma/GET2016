package RemoveDuplicateInArray;
class RemoveDuplicateInArray{
	
	public int[] removeDuplicate( int input[]){
		//initialize of variable for counting duplicate
		int duplicate = 0;
		
		for(int i=0;i<input.length-duplicate;i++){  //for loop for traverse array
			int temp=input[i];	
			
			for(int j=i+1; j<input.length-duplicate ; j++){  //for loop for traverse array for each element
				if(temp==input[j]){
					duplicate++;
					for(int k=j;k<input.length-duplicate;k++){  //  for loop for changing position or shifting array at duplicate element
						input[k]=input[k+1];
					}if(temp==input[j]){
						for(int k=j;k<input.length-duplicate;k++){
						input[k]=input[k+1];
					}
					}
				}
			}
		}//End of first for loop
		int size=input.length-duplicate; 
		
		int resultArray[]=new int[size];
		
		for(int i=0;i<size;i++){
			resultArray[i]=input[i];
		}
		
		for(int i=0;i<size;i++){
			System.out.println(resultArray[i]);
		}
		
		return resultArray;
	}
}
public class MainRemoveDuplicateInArray {

	public static void main(String[] args) {
		int a[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int b[]={1,1,1,1};
		new RemoveDuplicateInArray().removeDuplicate(a);

	}

}
