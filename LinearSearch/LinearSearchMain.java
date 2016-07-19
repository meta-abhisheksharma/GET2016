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
			System.out.println("Please Enter Valid Number");
			return -1;
		}
		else{
		if(first>last){		//element not find condition
			System.out.println("Please Enter Valid Number");
			return -1;	
		}
		else if(target>arr[first]){	//traverse condition when target is large
			return linearSearchResult(arr,++first, last, target); 		//recursive condition
		}
		else if(target==arr[first]){		//element find when target==arr[first]
			return first;
		}
		else{	// case when element is less then first element
			System.out.println("Please Enter Valid Number");
			return -1;
		}
		}
	}
	
	
}
public class LinearSearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=scan.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter Array :");
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		System.out.print("Enter Target :");
		int target =scan.nextInt();
		System.out.println(new LinearSearch().linearSearchResult(arr,0,arr.length-1,target));
	}

}
