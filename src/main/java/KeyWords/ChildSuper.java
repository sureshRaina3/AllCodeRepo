package KeyWords;

public class ChildSuper extends Super{
	int a= 40;
	int b = 60;
	
	
	public void calculation() {
		System.out.println(super.a+super.b);
				
	}
	public void calculation1() {
		System.out.println(a+b);
		//super.method();// 
		
	}
	public void arun() {
		System.out.println("This is child method");
	}
	public void callparent() {
		super.arun();
	}

	public static void main(String[] args) {
		ChildSuper c= new ChildSuper();
		c.calculation();
		c.calculation1();
	}
	
}
