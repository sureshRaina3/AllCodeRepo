package PracticalCode;

public class RecursionExample {
	public static void example() {
		
		System.out.println("this is recursionExample");
		example();
		
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		RecursionExample r= new RecursionExample();
		
		r.example();

		// TODO Auto-generated method stub
		

	}

}
