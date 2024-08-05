package KeyWords;

public class Super {

	int a= 60;
	int b= 30;
	
	Super(){
		System.out.println("Parent class constructor is invoked");
		}
		public void method(int c) {
		System.out.println("This is parent class method");
		//int c= 23;
		int d = c+10;
		System.out.println(d);
				
	}
		public void arun() {
			System.out.println("Hii this is parent");
		}

}
