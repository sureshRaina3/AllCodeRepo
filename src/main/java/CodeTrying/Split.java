package CodeTrying;



public class Split {
	public static void main(String[] args) {
		String s = "Hello My Name is Suresh";
		String[]set =s.split("\\s");
		for(String get : set) {
			System.out.println(get);
			if (get.matches("Suresh")) {
				System.out.println(get);
			}
		}
	
		
		
	}

}
