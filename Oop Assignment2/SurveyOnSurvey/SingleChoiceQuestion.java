package SurveyOnSurvey;

import java.util.ArrayList;
import java.util.List;

public class SingleChoiceQuestion extends Question{
	
	String option;
	String answer;
	
	
	
	
	
	public SingleChoiceQuestion(String qus, String opt) {
		// TODO Auto-generated constructor stub
		super(qus);
		option=opt;
	}

	public void setAnswer(String ans){
		answer=ans;
	}
	
	public String getAnswer(){
		return answer;
	}
	
	public String getOption(){
		return option;
	}
	
	
}
