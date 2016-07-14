 class BinaryToOctalClass{
	public int power (int n , int p){		
		if (p==0){
			return 1;
		}
		return n*power(n,p-1);
		}
	
	
	 public  int convertBinaryToOctal(int n){
		
			int decimal=0;
			for(int l=1;n>0;n=n/10){
				decimal=decimal + (n%10)*power(2,l-1);  //Code to covert binary to decimal
				l++;
			}
						
			int revOctal=0;		
			for (;decimal>0;decimal=decimal/8)
			{
			revOctal=revOctal*10 + (decimal%8);  //Code to convert decimal to Octal but in reverse
			}
						
			int octal=0;
			for(;revOctal>0;revOctal=revOctal/10){
				octal=octal*10 +revOctal%10;		// Code to reverse revOctal to obtain into Octal
			}
			return octal;
		}
}
public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryToOctalClass ob= new BinaryToOctalClass();
		ob.convertBinaryToOctal(110101);
	}
	
	
	
}
