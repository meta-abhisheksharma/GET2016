package TowerOfHanoi;


import java.util.Scanner;

class TowerOfHanoiSolution{
	
	/**
	 * 
	 * @param size -->number of disks
	 * @param start --starting position
	 * @param end -->ending position
	 * @param aux --> auxilary position
	 * @return solution string
	 */
	int i=0;
	public String[] getTOHSolution(int size,String start,String aux,String end,String result[]){
		//Exception handling for negetive number
		if(size<=0){
			System.out.println("Please Enter a Valid Number");
			return null;
		}
		
		//base case 
		if(size==1){
			result[i++]=start+"-->"+end;
			
		}
		//recurring case
		else{
			getTOHSolution(size-1,start,end,aux,result);
			result[i++]=start+"-->"+end;
			getTOHSolution(size-1,aux,start,end,result);
		}
		return result;
	}
	
	
}

public class TowerOfHanoiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter No. disks :");
		int number=scan.nextInt();
		if(number<=0){
			System.out.println("Please Enter a Valid Number");
			System.exit(1);
		}
		int strSize=((int)Math.pow(2,number))-1;
		String str[]=new String[strSize];
		String result[]=new TowerOfHanoiSolution().getTOHSolution(number,"A","B","C",str);
		for(int i=0;i<strSize;i++){
		System.out.println(result[i]);
		}
		scan.close();
	}

}
