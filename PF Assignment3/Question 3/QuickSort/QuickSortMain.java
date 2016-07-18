package QuickSort;
class QuickSort{
	/*sort array & return resulting sorted array
	 * arr-->array to be sorted
	 * first-->starting index
	 * last-->end index
	 */
	public int[] quickSortResult(int arr[],int first,int last){
		if(arr.length==0){
			return null;
		}
		else{
		if(first<last){
			int partitionIndex=partitionArray(arr,first,last); //partitioning of array
			
			//Recursive sorting approch
			quickSortResult(arr,first,partitionIndex-1);
			quickSortResult(arr, partitionIndex+1, last);
		}
		return arr;
		}
	}
	
	/*partition array & return index
	 * arr-->array to be sorted
	 * first-->starting index
	 * last-->end index
	 */
	public int partitionArray(int arr[],int first,int last){
		
		int pivot=arr[last];		//pivot element
		int index=first-1;		
		for(int row=first;row<=last-1;row++){	
			if(arr[row]<=pivot){		//swapping of element
				index++;
				int temp=arr[index];
				arr[index]=arr[row];
				arr[row]=temp;
			}
		}
		
		// swapping of pivot element
		int temp=arr[index+1];
		arr[index+1]=arr[last];
		arr[last]=temp;
		
		return index+1;
	}
}

public class QuickSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		*/
		int arr[]=new int[]{2,5,8,9,10, 77, 55, 11};
		int obj[]=new QuickSort().quickSortResult(arr,0,arr.length-1);
		for(int row=0;row<=arr.length-1;row++){
			System.out.println(obj[row]);
		}
		
	}

}
