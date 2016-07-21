package SurveyOnSurvey;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SurveyMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		BufferedWriter out = null;
		List<String> lst=new ArrayList<String>();
		String line;
		SurveyQuestionPaper sPaper=new SurveyQuestionPaper();
		String status="";
		int count=0;
		int sinOption=0;
		do{
		try {
			in = new BufferedReader(new FileReader(".//src//SurveyOnSurvey//source.txt"));
			out = new BufferedWriter(new FileWriter(".//src//SurveyOnSurvey//report.txt", true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while((line = in.readLine()) != null)
		{	
			String str[]=line.split(",");
			
			//Single select case
			if(str[1].trim().equalsIgnoreCase("Single Select")){
				
				diplayQuestion(str,1);
				String option[]=getOptionArray(str[2]);
				sinOption=option.length;
				String answer=choiceSelect(str[2],1);
				lst.add(answer);
				sPaper.addSingleChoiceQuestion(str[0], str[2],answer);
				
			}
			
			//multi select case
			else if(str[1].trim().equalsIgnoreCase("Multi Select")){
				
				diplayQuestion(str,2);
				String option[]=getOptionArray(str[2]);
				String answer=choiceSelect(str[2],2);
				sPaper.addMultipleChoiceQuestion(str[0], str[2],answer);
				
		
			}
			
			//Text select case
			else if(str[1].trim().equalsIgnoreCase("Text")){
				diplayQuestion(str,3);
				String answer=choiceSelect("",3);
				sPaper.addTextQuestion(str[0], answer);
				
			}
			
		}
		count++;
		printReport(sPaper,out,count);
		System.out.print("Enter y of Y for next participent survey");
		Scanner scan =new Scanner(System.in);
		status=scan.next();
		
		}while(status.equalsIgnoreCase("y"));
		
		/*Map<String, Integer> map=sPaper.surveyPercentage(lst);
		for(int index=0;index<sinOption;index++){
			int per=(map.get(index+1)/count)*100;
			out.write(""+index+" :"+per);
			out.flush();
			out.newLine();
		}
		*/
		
		in.close();
		
		
		    
		
	}
	//Printing report
	public static void printReport(SurveyQuestionPaper sPaper,BufferedWriter out,int count) throws IOException {
		
		out.newLine();
		out.newLine();
		out.write("Participant"+count);
		out.flush();
		out.newLine();
		for(SingleChoiceQuestion obj:sPaper.getSingleList()){
			
			out.write(obj.getQuestion()+"\n"+obj.getAnswer());
			out.flush();
			out.newLine();
		}
		
		for(MultipleChoiceQuestion obj:sPaper.getMultiList()){
			
			out.write(obj.getQuestion()+"\n"+obj.getAnswer());
			out.flush();
			out.newLine();
		}
		
		for(TextQuestion obj:sPaper.getTextList()){
			
			out.write(obj.getQuestion()+"\n"+obj.getAnswer());
			out.flush();
			out.newLine();
		}
	}
	/*public static String[] getStatics(String str[]){
		System.out.println(str[0]);
		String singleOption[]=(str[2].trim().substring(1,str[2].length()-2)).split("/");
		for (int index=0;index<singleOption.length;index++){
	         System.out.println(""+(index+1)+" --> "+singleOption[index]);
	      }
		return singleOption;
	}*/
	
	//method for printing question and option
	public static void diplayQuestion(String str[],int type){
		System.out.println(str[0]);
		
		if(type==1 || type==2){
		System.out.println(str[2]);
		}
	}
	
	//method for option array
	public static String[] getOptionArray(String opt){
		String option[]=(opt.trim().substring(1,opt.length()-2)).split("/");
		return option;
	}
	//method for input
	public static String choiceSelect(String opt,int type){
		Scanner scan=new Scanner(System.in);
		String choiceString="";
		//for text type
		if(opt.equals("") && type==3){
			choiceString=scan.next();
			return choiceString;
		}
		String option[]=getOptionArray(opt);
		
		
		
		System.out.print("choose Answer Option : ");
		String text="";
		
		
		{
			
			int counter=0;
			int choice;
			do{
				choice=scan.nextInt();
				
				if(choice <=0 || choice>option.length){
					System.out.println("Please Enter Valid Option & Start again form 1st question");
					choiceSelect(opt,type);
				}
				choiceString=choiceString+option[choice-1];
				if(type==2){
				System.out.print("Choose Y or y to next choice");
				text=scan.next();
				if(text.equalsIgnoreCase("y") && counter<option.length){choiceString=choiceString+"/";}
				counter++;
				}
			}while(text.equalsIgnoreCase("y") && counter<option.length);	
		}//multiple type
		return choiceString ;
	}
	
	/*public static void setQuestion() throws IOException{
		String line;
		int count=0;
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader(".//src//SurveyOnSurvey//source.txt"));
			out = new BufferedWriter(new FileWriter(".//src//SurveyOnSurvey//report.txt", true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while((line = in.readLine()) != null)
		{	count++;
			String str[]=line.split(",");
			
		if(str[1].trim().equalsIgnoreCase("Single Select")){	//when question type is single choice
			
			String singleOption[]=getStatics(str);
			
			SingleChoiceQuestion obj=new SingleChoiceQuestion(str[0],singleOption);
			Scanner scan=new Scanner(System.in);
			System.out.print("choose Answer Option : ");
			int choice=scan.nextInt();
			if(choice <=0 || choice>singleOption.length){
				System.out.println("Please Enter Valid Option & Start again form 1st question");
				setQuestion();
			}
			obj.setAnswer(singleOption[choice-1]);
			out.newLine();
			out.write(obj.getQuestion()+"\n"+obj.getAnswer());
			out.flush();
			out.newLine();
			
			
		}//End of single select case
		
		else if(str[1].trim().equalsIgnoreCase("Multi Select")){		//when question type is multiple choice
			
			String[] singleOption=getStatics(str);
			MultipleChoiceQuestion obj=new MultipleChoiceQuestion(str[0],singleOption);
			Scanner scan=new Scanner(System.in);
			System.out.print("choose Answer Option : ");
			String text;
			int counter=0;
			String choiceString="";
			int choice;
			do{
				choice=scan.nextInt();
				
				if(choice <=0 || choice>singleOption.length){
					System.out.println("Please Enter Valid Option & Start again form 1st question");
					setQuestion();
				}
				choiceString=choiceString+singleOption[choice-1]+"/";
				
				System.out.print("Choose Y or y to next choice");
				text=scan.next();
				counter++;
			}while(text.equalsIgnoreCase("y") && counter<singleOption.length);
			obj.setAnswer(choiceString);
			out.write(obj.getQuestion()+"\n"+obj.getAnswer());
			out.flush();
			out.newLine();
		}//End of multi select case
		
		else if(str[1].trim().equalsIgnoreCase("Text")){		//when question type is text
			System.out.println(str[0]);
			TextQuestion obj=new TextQuestion(str[0]);
			Scanner scan=new Scanner(System.in);
			
			String feedback=scan.next();
			obj.setAnswer(feedback);
			
			
			out.write(obj.getQuestion()+"\n"+obj.getAnswer());
			out.flush();
			out.newLine();
		}//End of text case
			
		   
		}//End while loop
		
		in.close();
	}//close  setQuestion
*/	
	

}
