
package CodeTrying;

import java.util.Scanner;

public class Pyramid {
	
	
	public static void main(String[] args) {
		
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int row = sc.nextInt();
		for (i=1; i<=row; i++) {
			for (j=1; j<=row-i;j++){
				System.out.print(" ");
			}
				for (j=1; j<=i;j++){
					System.out.print("* ");
				}
				System.out.println();
				
		}
		
	}
	

}
