package ReminderRecursion;

import java.util.Scanner;

class Reminder{
	/*recursive approch for reminder
	 * @x & @y is param
	 * @return reminder
	 */
	public int reminderCal(int x, int y){
		if(y==0){		//Case for divide by zero
			return -1;
		}
		else if(y>x){	//reminder case when dividend is small
			return x;
		}
		else{
		return reminderCal(x-y,y); 	//recursive method for reminder
		}
	}
}

public class ReminderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();*/
		System.out.print(new Reminder().reminderCal(2, 0));
	}

}
