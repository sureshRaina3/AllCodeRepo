package CodeTrying;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number:");
		int lastnum = sc.nextInt();
		for(int i = 1; i<=lastnum; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
