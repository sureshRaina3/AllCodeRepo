package HandsOns;

public class Largestnumber {

	public static void main(String[] args) {
		int large=0;
		
		
		 int number[]= {10,20,30,55,50};
		// int max= number[0];
		 for(int i=0;i<number.length;i++) {
			 if (large<number[i]) {
				 large=number[i];
			 }
			 }
				 
		 System.out.println(large);
		 

	}

	}


