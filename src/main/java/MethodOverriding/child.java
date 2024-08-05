package MethodOverriding;

public class child extends parent {
	
	public void method(int a, int b) {
		
		System.out.println(a+b);
		System.out.println("Hi i am child method");
	}
	public void CallingParentMethod() {
		super.method(10, 20);
	}

	public static void main(String[] args) {
		child c =new child();		// TODO Auto-generated method stub
		//c.method(10,10);
		//c.menthod2();
		c.CallingParentMethod();

	}

}
