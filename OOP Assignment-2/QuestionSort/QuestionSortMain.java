package QuestionSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionSortMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		BufferedWriter out = null;
		String line;
		List<String> lst=new ArrayList<String>();
		
		try {
			in = new BufferedReader(new FileReader(".//src//SurveyOnSurvey//source.txt"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while((line = in.readLine()) != null)
		{	
			lst.add(line);
		}
			Question qus1=new Question(lst.get(0));
			Question qus2=new Question(lst.get(1));
			int result = qus1.compareTo(qus2);		//comparasion of two String
			System.out.print(lst.get(0)+"\n"+lst.get(1)+"\n Result"+result);
			System.out.println();
			
		

	}
}
