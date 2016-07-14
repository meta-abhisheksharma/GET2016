package MergeSortedArray;
class MergeSortedArray{
public int[] mergeArray(int a[],int m,int b[],int n){
   //initialize of array
	int i=m-1;
    int j=n-1;
    int k=m+n-1;
    int c[]=new int[k+1];
    while(i>=0 && j>=0){
    if(a[i]>b[j]){  // comparision between both array
        c[k]=a[i]; 	// a's element in c if it is bigger then b
        i--;k--;	
    }
    else{
        c[k]=b[j];
        j--;k--;
    }
    
    }
    if(i>=0){
        while(i>=0){  //this loop for remaining element
        c[k]=a[i];
        i--;k--;
                }
    }
    else{
        while(j>=0){
        c[k]=b[j];
        j--;k--;
                }
    }
    
    for(int l=0;l<m+n;l++){
    System.out.println(c[l]);
    }
    return c;
}
}
public class MainMergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArray ob=new MergeSortedArray();
        int a[]={1,4,6,7};
        int b[]={2,5,8};
        ob.mergeArray(b,3,a,4);

	}

}
