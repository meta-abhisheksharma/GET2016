package PermutationString;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
class StringPermutation{
	String temp="";
	
	/**it permutate whole string and convert 
	 * it to list and return list
	 * @param str
	 * @return list
	 */
	public List<String> getPermutation(String str){
		
		 
		 List<String> newList = permutation("", str);
		 List<String> uniqueList = new ArrayList<String>();
		    for(int i=0;i<newList.size();i++) {		//remove duplicate element from list
		        if(!uniqueList.contains(newList.get(i)))
		            uniqueList.add(newList.get(i));
		    }
		    
		    ListIterator litr = uniqueList.listIterator();
		      while(litr.hasNext()) {
		         Object element = litr.next();
		         System.out.print(element + " ");
		      }
		 
		 return uniqueList;
	}
	/**it gives permutation using recursion
	 * and use temp to store
	 * @param temp-->store the permute string
	 * @param str-->it is given string
	 */
	public List<String> permutation(String temp, String str) {
		List<String> permutations = new ArrayList<>();
	    int n = str.length();		//length of string
	    if (n == 0){
	    	 permutations.add(temp);		//base condition
	    }
	    else {		//recurring condition
	        for (int index = 0; index < n; index++){
	            permutations.addAll(permutation(temp + str.charAt(index), str.substring(0, index) + str.substring(index+1, n)));
	        }
	    }
	    return permutations;
	}
	
	
	
}


public class PermutationStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter String:");
		String str=scan.next();
		StringPermutation obj=new StringPermutation();
		obj.getPermutation(str);
	}

}
