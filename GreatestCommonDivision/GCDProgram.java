package GreatestCommonDivision;

import java.util.Scanner;

class GCD{
	/*
	 * GCDMethod()
	 * @n1 and @n2 are number of which GCD is calculated
	 */
	public int GCDCalculate(int number1 , int number2){
		
	if(number1<=0 || number2<=0){	//negetive case
		System.out.println("Enter Valid No.");
		return -1;
	}
	
	 //Exception handling when number1<number2
	if(number1<number2){	//condition of swapping when n1<n2
		int temp=number1;
		number1=number2;
		number2=temp;
	}
	if(number1%number2==0){	//base condition
			return number2;
		}
		else{		//recurring condition
			return GCDCalculate(number2,number1%number2);
		}
	}
}

public class GCDProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("First No.:");
		int number1=scan.nextInt();
		System.out.print("Second No.:");
		int number2=scan.nextInt();
		GCD ob=new GCD();
		System.out.print(ob.GCDCalculate(number1,number2));
	}

}
