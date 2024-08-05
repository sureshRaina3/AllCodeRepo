package PracticalCode;

public class primeornot {
	/*package whatever //do not write package name here */

	/*function to check prime or not*/

		static void prime(int no)
		{
			int count = 0;
			for (int i = 1; i <= no; i++)
			{
				if (no % i == 0)
					count++;
			}
			if (count == 2)
				System.out.println(no + " is prime");
			else

				System.out.println(no + " is not prime");
		}

		public static void main(String[] args)

		{

			prime(13); // calling

			prime(20);

			prime(23);
		}
	}


