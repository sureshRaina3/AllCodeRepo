package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer ,String>city= new HashMap<Integer,String>();
		//Map<String ,String>city1= new HashMap<String,String>();
		city.put(1, "chennai");
		city.put(2, "kochi");
		city.put(3, "Kolkatha");
		city.put(4, "Delhi");
		city.put(null, "Delh");
		
		
		System.out.println(city.get(4));
		city.remove(3);	
		System.out.println(city.get(null));

	}

}
