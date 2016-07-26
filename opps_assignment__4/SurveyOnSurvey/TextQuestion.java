package SurveyOnSurvey;

import java.util.ArrayList;
import java.util.List;

public class TextQuestion extends Question {
	String answer;
	
	
	public TextQuestion(String qus){
		super(qus);
	}
	
	public void setAnswer(String ans){
		answer=ans;
	}
	
	public String getAnswer(){
		return answer;
	}
	
	
}
