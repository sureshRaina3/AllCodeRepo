package Encapsulation;

public class animal {
	
	public static void main(String[] args) {
		Opps opps = new Opps();
		opps.setAnimal("bark","dog");
		System.out.println("The " + opps.getName() + "is " + opps.getSound() + "ing");
		
	}
}
