package Interface;

public class Dolly implements Rahul {
	
	int a =10;

	@Override
	public void rest() {
		this.a =20;
		System.out.println(a);
		
		 
		
	}
	public static void main(String[] args) {
		Dolly D =new Dolly();
		D.rest();
		System.out.println(D.a);
	}

	

}
