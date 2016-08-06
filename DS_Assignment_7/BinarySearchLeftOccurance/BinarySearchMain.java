package BinarySearchLeftOccurance;

import java.util.Scanner;

public class BinarySearchMain {

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
