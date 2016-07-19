package BinarySearchRecursive;

import java.util.Scanner;



class BinarySearch{
	
	/*binarySearchMethod is recursive method for searching element
	 * @arr[] is seraching array
	 * @target is value we have to be search
	 * @first & @last is variable for tracking
	 * */
	public int binarySearchResult(int arr[],int first,int last,int target){
		//Exception handling when array is empty
		if(arr.length==0){
			System.out.println("Empty Array");
			return -1;
		}
		else{
		int mid=(first+last)/2; 	//to find midean position of array
		if(first>last){				//target not found condition
			System.out.println("Result Not Found");
			return -1;
		}
		else if(target<arr[mid]){		//when target is lesser then a[mid]
			return binarySearchResult(arr, first, mid-1, target);
		}
		else if(target>arr[mid]){		//when target is greater then a[mid]
			return binarySearchResult(arr, mid+1, last, target);
		}
		else{
			return mid;		//target found condition
		}
		}
	} //End of binaryFunction
	
	
}

public class BinarySearchRecursive {

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
		System.out.println(new BinarySearch().binarySearchResult(arr,0,arr.length-1,target));
	}

}
