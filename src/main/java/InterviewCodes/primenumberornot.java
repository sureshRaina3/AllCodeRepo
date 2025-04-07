package InterviewCodes;

public class primenumberornot {

	
	public static void main (String[]args){
		
		int isPrimeNumber= 19;
		int count =0;
		
		for(int i =1; i<=isPrimeNumber/2; i++){
			
			if (isPrimeNumber%i==0){
				count++;
		}
		
		}
		if (count==1){
			System.out.println("its a prime number");
			
		}else {
			System.out.println("its not a prime number");
		}
	}
}
