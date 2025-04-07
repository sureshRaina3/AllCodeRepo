package InterviewCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printUniqueCharacters {

	public static void main(String[] args) {
		
		String[]name = {"a","b","a","c","d"};
	
		List<String>Names = Arrays.asList(name);
		List<String>Names2 = new ArrayList<String>();
		System.out.println(Names.get(0));
		for (int i=0;i<Names.size()-1; i++) {
			for (int  j=1;j<Names.size(); j++) {
			
			  if (Names.get(i).equals(Names.get(j))) {
				  System.out.println(Names.get(i));
			  }
			  else {
				  Names2.add(Names.get(i));
			  }
				  
			}
		}
		System.out.println(Names.toString());
		
		

	}

}
