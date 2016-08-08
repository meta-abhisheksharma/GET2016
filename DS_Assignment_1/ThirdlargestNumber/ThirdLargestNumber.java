package ThirdlargestNumber;
class LargestNumber{
	public int getThirdLargestNumber(int array[]){
		int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE;
		

		// first= second= third= array[0];
		for (int index = 0; index < array.length; index++) {
			if (first < array[index]) { 
			    third = second;
			    second = first;
			    first = array[index];
			} else if (second < array[index] && first > array[index]) {
			    third = second;
			    second = array[index];
			} else if (third < array[index] && second > array[index]){
			    third = array[index];
			}
		}
		return third;
	}
}

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int[] array= new int[]{1, 4, 3, 7, 0, 5, 6};
		LargestNumber large= new LargestNumber();
		int thirdLargest= large.getThirdLargestNumber(array);
		System.out.println("Third Largest number is: "+thirdLargest);
	}

}
