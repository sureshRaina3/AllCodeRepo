package CodeTrying;

import java.util.Scanner;

public class splitwithdastrandom {
	
	public static void split() {
		Scanner sc = new Scanner(System.in);
		System.out.println("starting number:" );
		int start = sc.nextInt();
		System.out.println("Ending number:" );
		int end = sc.nextInt();
		
		for(int i= start; i<=end; i++ ) {
			
			
		 
			if (i%3==0) {
				System.out.print(i+"-");
			}
			else {
				System.out.print(i);
			}
		}	
	}
	
	public static void pyramid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("pyramid line count");
		int start = sc.nextInt();
		for (int i=1; i<=start; i++)
			for(int j=1; j<=i;i++) {
				System.out.print("* ");
			}
		System.out.println();
	}
	
	public static void palindrome() {
		
		String orginal="mom";
		String reverse="";
		char ch;
		
		
		for (int i =0; i<orginal.length(); i++) {
			ch=orginal.charAt(i);
			reverse=ch+reverse;
			
		}
		if (orginal.equalsIgnoreCase(reverse)) {
			System.out.println("its a palindrome");
		}
		
	}

	public static void main(String[] args) {
		//splitwithdastrandom.palindrome();
		splitwithdastrandom.pyramid();
		
		
	}
	

	

}
