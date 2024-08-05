package HandsOns;

import java.util.Scanner;

public class palidrome {
	
	public static void main(String[] args) {
		char ch;
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String name = sc.nextLine();
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			reverse = ch+reverse;	
			
		}
		System.out.println(reverse);
		if (reverse.equalsIgnoreCase(name)) {
			System.out.println("its a palindrome");
		}else {
			System.out.println(" its not a palindrome");
		}
		
			
		
	}

}
