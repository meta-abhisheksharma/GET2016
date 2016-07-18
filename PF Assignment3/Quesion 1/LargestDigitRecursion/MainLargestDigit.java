package LargestDigitRecursion;
class LargestDigit{
	/*recursion approch to find largest number
	 * @x is number
	 * @return largest digit
	 */
	public int largestDigitCal(int number){
		
		//Exception handling when number is negetive
		if(number<0){
			number=number*-1;
		}
		if(number/10==0){ 	//base case for recursion when it will be stop
			return number;
		}
		else{		//find largest digit via conditional operator
			int digit=number%10;
			return(digit>largestDigitCal(number/10)?digit:largestDigitCal(number/10));
		}
	}
}

public class MainLargestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LargestDigit().largestDigitCal(34256));
	}

}
