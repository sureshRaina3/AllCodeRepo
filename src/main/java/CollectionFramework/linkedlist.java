package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList <String>fruits = new LinkedList<String>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("jackfruit");
		fruits.add("Mango");
		fruits.addFirst("grape");
		//fruits.
		
		for(int i =0; i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}


	}
	
	
	

}
