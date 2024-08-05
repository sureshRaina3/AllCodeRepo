package MethodOverloading;

public class methodoverloading {

	
	public void addvalues(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	public void addvalues(int a, int b, int c) {
		int d= a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading mov= new methodoverloading();
		mov.addvalues(20, 30);
		mov.addvalues(10, 20, 30);

	}

}
