package SocialNetwork;

import java.io.IOException;
import java.util.ArrayList;

public class SocialNetworkMain {
	
	static RecordDisplay rdisplay;
	static Entity  entity;

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> a= new ArrayList<Integer>();
		
		entity= new Entity();
		entity.getSourceDetail();
		rdisplay= new RecordDisplay();
		rdisplay.initialDisplay();
	}
}
