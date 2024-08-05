package CodeTrying;

import java.util.Scanner;

public class PatternReverse {

	public static void main(String[] args) {
		int i, j;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the last number:");
		int lastnum = sc.nextInt();
		
		for(i= lastnum; i>=1; i--) {
			for (j=1;j<=i; j++) {
				
				System.out.print(j+" ");
			}
			System.out.println();
					
		}
	}

}
