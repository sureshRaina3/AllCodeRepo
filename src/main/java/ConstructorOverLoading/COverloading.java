package ConstructorOverLoading;

class COverloading {
	int a;
	int b;
	int c;
	
	 COverloading(int d,int e){
		a=d;
		b=e;
				
		System.out.println(a+b);
		
	}
	 COverloading(int d ,int e, int f) {
		a=d;
		b=e;
		c=f;
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		COverloading c= new COverloading(10,20);
		COverloading c1= new COverloading(10,20,30);
		
		
		
		// TODO Auto-generated method stub

	}

}

