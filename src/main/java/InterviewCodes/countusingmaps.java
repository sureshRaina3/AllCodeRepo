package InterviewCodes;

import java.util.HashMap;
import java.util.Map;

public class countusingmaps {

	public static void main(String[] args) {
		String []name = {"suresh","suresh","vas","ley","vas","dhana","suresh"};
		Map<String, Integer>counts = new HashMap<String,Integer>();
		
		for (String eachname :name) {
			if (counts.containsKey(eachname)) {
				
				counts.put(eachname, counts.get(eachname)+1);
				
			}else 
				
				counts.put(eachname, 1);
		}
		
		System.out.println(counts);

	}

}
