package HandsOns;

import java.util.Scanner;

public class PrimeNumberorNot {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		for (int s =1; s<=a; s++) {
			if (a%s==0) {
				count++;
				//System.out.println(count);
			}	
		}
		if (count==2) {
			System.out.println(" its a prime number");
		}else {
			System.out.println("its not a prime number");
		
		}

	}

}
