package SurveyOnSurvey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MultipleChoiceQuestion extends Question{
	
	String option;
	String answer;
	
	
	
	public MultipleChoiceQuestion(String qus, String opt) {
		// TODO Auto-generated constructor stub
		super(qus);
		option=opt;
	}
	
	/**
	 * method for validation and insert answer
	 * @param ans
	 */
	public void setAnswer(String ans){	//validation of multiple choice
		String str[]=ans.split("/");
		List<String> tmpList = Arrays.asList(str);
		TreeSet<String> unique = new TreeSet<String>(tmpList);
		String[] result = unique.toArray(new String[unique.size()]);
		String answer="";
		for(int index=0;index<result.length;index++){
			answer=answer+result[index];
		}
		this.answer=answer;
	}
	
	public String getAnswer(){
		return answer;
	}
	
	public String getOption(){
		return option;
	}
	
	
}
