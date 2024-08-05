package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sets {
	public static void main(String[] args) {
		Set<String> bikes= new HashSet<String>();
		bikes.add("tvs");
		bikes.add("yamaha");
		bikes.add("hero");
		bikes.add("honda");
		bikes.add(null);
		bikes.add("tvs");
		
		//ArrayList <String> setbikes = new ArrayList<String>(bikes);
		//System.out.println(setbikes.get(0));
		Iterator<String>itr = bikes.iterator() ;
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//String[] cycle= {"hii","hello","vanakam"};
		
	
	}
	

}


