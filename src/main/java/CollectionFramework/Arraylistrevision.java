package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Arraylistrevision   {
	public static void main(String[] args) {
		ArrayList<String>cars = new ArrayList<String>(5);
		cars.add("volvo");
		cars.add("lamborhini");
		cars.add("Audi");
		cars.add("BMW");
		
		cars.add(2,"bently");
		
		 cars.add (3,"bently");
		
		for(String car: cars) {
			System.out.println(car);
		}
		
		ArrayList<String>cars1 = new ArrayList<String>(5);
		cars1.add("volvo");
		cars1.add("lamborhini");
		cars1.add("Audi");
		cars1.add("BMW");
		
		cars1.add(2,"bently");
		
		if(cars.equals(cars1)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//for(int i =0; i<cars.size();i++) {
		//	System.out.println(cars.get(i));
		//}
	
	}
	
	
}
