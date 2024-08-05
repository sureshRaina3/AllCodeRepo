package HandsOns;

import java.util.Scanner;

public class PrintOddorEvenNumber {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		if (a%2==0) {
			System.out.println("it is a evennumber");
		}else {
			System.out.println("it is a Oddnumber");
		}
	
		
	}
	
	
	


}
