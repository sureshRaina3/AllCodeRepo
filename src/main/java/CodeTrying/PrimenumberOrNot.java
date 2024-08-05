package CodeTrying;

import java.util.Scanner;

public class PrimenumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter a number");
		int pm = sc.nextInt();
		for (int i=1; i<=pm;i++) {
			if (pm%i==0) {
				count++;
			}
			
		}
		if (count==2) {
			System.out.println(pm+" is a primenumber");
		}
		else {
			System.out.println(pm+" is not a primenumber");
		}
		sc.close();

	}

}
