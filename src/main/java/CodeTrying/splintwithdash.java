package CodeTrying;

import java.util.Scanner;

public class splintwithdash {
	
	public static void main(String[] args) {
		
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

}
