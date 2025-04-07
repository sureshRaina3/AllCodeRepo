package InterviewCodes;

public class sumofalldigits {

	public static void main(String[] args) {
		
		int num =98768;
		int remainder =0;	
		int sum=0;
		
		
		while (num!=0){
			
			remainder = num%10;
			sum += remainder;
			num =num/10;
			
		}
		System.out.println(sum);

	}

}
