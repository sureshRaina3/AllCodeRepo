package PracticalCode;

import java.util.Scanner;

public class Train {
	static Scanner sc;

	public static void main(String[] args) {
		sc= new Scanner(System.in);
		System.out.println("Enter the Number of Passangers");
		int passangers = sc.nextInt();
		for(int i=1; i<=passangers; i++) {
			if (i<=passangers) {
			System.out.println("Enter the Name of the Passanger" +i+":"+sc.nextLine());
			System.out.println("Enter the Seat details of the passanger" +i);
			String coach = sc.nextLine();
			int seatno = sc.nextInt();	
			}
			}

	}

}
