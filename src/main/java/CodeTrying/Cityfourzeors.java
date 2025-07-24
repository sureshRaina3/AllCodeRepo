package CodeTrying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cityfourzeors {

	public static void main(String[] args) {
		
		List<String>city =new ArrayList<String>();
		System.out.println("Enter the city count: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.println(i);
			city.add(sc.next());
		}
		
		for(int j=0; j<city.size();j++) {
			String eachcity = city.get(j);
			for (int k =0;k<=2;k++) {
				System.out.print(eachcity.charAt(k));
			}
			for (int k =0;k<=3;k++) {
				System.out.print("0");
			}
			System.out.println();
		}
		
		
	}

}
