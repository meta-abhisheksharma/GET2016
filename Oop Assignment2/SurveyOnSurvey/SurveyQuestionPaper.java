package SurveyOnSurvey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.soap.Text;

public class SurveyQuestionPaper {
	private List<SingleChoiceQuestion> sList=new ArrayList<SingleChoiceQuestion>();
	private List<MultipleChoiceQuestion> mList=new ArrayList<MultipleChoiceQuestion>();
	List<TextQuestion> tList=new ArrayList<TextQuestion>();
	
	void addSingleChoiceQuestion(String qus,String opt,String ans){
		SingleChoiceQuestion sQustion=new SingleChoiceQuestion(qus,opt);
		sQustion.setAnswer(ans);
		sList.add(sQustion);
	}
	
	void addMultipleChoiceQuestion(String qus,String opt,String ans){
		MultipleChoiceQuestion mQuestion=new MultipleChoiceQuestion(qus,opt);
	    mQuestion.setAnswer(ans);
		mList.add(mQuestion);
	}
	
	void addTextQuestion(String qus,String ans){
		TextQuestion tQuestion=new TextQuestion(qus);
		tQuestion.setAnswer(ans);
		tList.add(tQuestion);
	}
	
	List<SingleChoiceQuestion> getSingleList(){
		return sList;
	}
	
	List<MultipleChoiceQuestion> getMultiList(){
		return mList;
	}
	
	List<TextQuestion> getTextList(){
		return tList;
	}
	
	public Map<String, Integer> surveyPercentage(List<String> lst){
		String[] array = lst.toArray(new String[lst.size()]);
		Map<String, Integer> occur = new HashMap<String, Integer>();
		for(int index=0; index < array.length; index++){
		       int nOcc = 1;
		       if(occur.containsKey(array[index])){
		         nOcc = occur.get(array[index]) + 1;
		       }
		       occur.remove(array[index]);
		       occur.put(array[index], nOcc);
		}
		return occur;
	}
	
}
