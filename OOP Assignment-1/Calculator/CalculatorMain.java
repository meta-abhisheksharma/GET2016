package Calculator;

import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener{
	
	private Layout lay;
	private Operator opr;
	private Display display;
	
	double result;
	
	public Calculator() {
		//do nothing constructor
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//logic for action when the buttons are clicked
	}
	
	public void calPerform(double num1, double num2, char opration){
		Operation obr=new Operation();
		Display dis=new Display();
		switch(opration){
		case '+':  
			obr.addition(num1, num2);
			dis.displayResult(obr.getResult());
			break;
		case '-': 
			obr.substraction(num1, num2);
			dis.displayResult(obr.getResult());
			break;
		case '*': 
			obr.multiplication(num1, num2);
			dis.displayResult(obr.getResult());
			break;
		case '/': 
			if(num2 != 0){		//divide by zero handling
				obr.divide(num1, num2);
				dis.displayResult(obr.getResult());
				
			}
		break;
		}
		
	}
	
}
public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		char opr=chooseOperator();
		double number1=0;
		double number2=0;
		
		Scanner scan=new Scanner(System.in);
		try{
			System.out.print("Enter first Number:");
			number1=scan.nextInt();
			System.out.print("Enter second Number:");
			number2=scan.nextInt();
			}catch(Exception e){ 
				System.out.println("Enter Valid Number");  //exception case when not valid number
				
			}
			
			obj.calPerform(number1, number2, opr);
		 }//End of main
	
		public static char chooseOperator(){
		char op;
		
		System.out.println("'+'-->Addition \n '-'-->Subtraction \n '*'-->Multipication \n '/'-->Divide ");
		System.out.print("Enter Your Choice");
		
		Scanner scan=new Scanner(System.in);
		op=scan.next().trim().charAt(0);
		if(op=='+' || op=='-' ||op=='*'||op=='/'){
		return op;
		}
		else{
			System.out.println("Enter valid operator"); //exeption case when not valid operator
			return ' ';
		}
		
			
	}
	



}
