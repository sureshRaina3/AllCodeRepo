package PracticalCode;

public class seventableexcept6 {
	// Java Program to print the multiplication table of the
	// number N.

		public static void main(String[] args)
		{
			// number n for which we have to print the
			// multiplication table.
			int N = 7;

			// looping from 1 to 10 to print the multiplication
			// table of the number.
			// using for loop
			for (int i = 1; i <= 10; i++) {
				// printing the N*i,ie ith multiple of N.
				if (i!=6)
				{		
				System.out.println(N + " * " + i + " = "
								+ N * i);
				}
			}
		}
}

