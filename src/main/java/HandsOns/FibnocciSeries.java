package HandsOns;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		 int n1 =0, n2 =1, n3, i, count;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the count:");
		 count=sc.nextInt();
		 //count = sc.nextInt();
		 System.out.print(n1+","+n2);
		 for(i=2;i<count;i++) {
			 n3 = n1+n2;
			 System.out.print(","+n3);
			 n1=n2;
			 n2=n3;
			 
		 }
		 

	}

}
