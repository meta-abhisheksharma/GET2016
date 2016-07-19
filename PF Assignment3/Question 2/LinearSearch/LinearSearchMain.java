package LinearSearch;

import java.util.Scanner;

class LinearSearch{
	
	/*
	 * linearSearchMethod for searching element
	 * @arr[] & @first & @last & @target is variable for recursion
	 */
	public int linearSearchResult(int arr[],int first,int last,int target){
		
		//Exception handling when size of array is empty
		if(arr.length==0){
			return -1;
		}
		else{
		if(first>last-1){		//element not find condition
			return -1;	
		}
		else if(target>arr[first]){	//traverse condition when target is large
			return linearSearchResult(arr,++first, last, target); 		//recursive condition
		}
		else{		//element find when target==arr[first]
			return first;
		}
		}
	}
	
	
}
public class LinearSearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		int target =scan.nextInt();*/
		System.out.println(new LinearSearch().linearSearchResult(new int[]{1,2,3,4,5},0,5,2));
	}

}
