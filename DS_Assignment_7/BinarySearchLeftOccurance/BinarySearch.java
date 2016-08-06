package BinarySearchLeftOccurance;

import java.util.Scanner;



public class BinarySearch {

	public int binarySearchResult(int arr[],int first,int last,int target){
		//Exception handling when array is empty
		if(arr.length==0){
			System.out.println("Empty Array");
			return -1;
		}
		else{
		int mid=(first+last)/2; 	//to find midean position of array
		if(first>last){				//target not found condition
			
			return -1;
		}
		else if(target<arr[mid]){		//when target is lesser then a[mid]
			return binarySearchResult(arr, first, mid-1, target);
		}
		else if(target>arr[mid]){		//when target is greater then a[mid]
			return binarySearchResult(arr, mid+1, last, target);
		}
		else{	//target found condition
			int leftOccurance = 0;
			leftOccurance = binarySearchResult(arr, first, mid-1, target); //found left occurance using recursion
			if(leftOccurance == -1){
				return mid;
			}
			else{System.out.println("mid"+mid+"leftOccurance"+leftOccurance);
				return leftOccurance;
			}
				
		}
		}
	} //End of binaryFunction
	
	
}

