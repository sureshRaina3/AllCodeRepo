package Patterns;

import java.util.Scanner;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		row = sc.nextInt();
		for (i=1;i<=row;i++) {
			for (j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for (j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	for (i = row-1;i>=1;i--) {
		for (j=1;j<=row-i;j++) {
			System.out.print(" ");
		}
		for (j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
	

}


}
