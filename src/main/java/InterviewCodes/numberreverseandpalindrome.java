package InterviewCodes;

public class numberreverseandpalindrome {

	
	public static void main(String[]args){
		
		int num = 3563; 
		int remainder =0;
		int reverse=0;
		
		int orginal =num;
		
		while(num!=0){
			
			remainder = num%10;
			reverse = reverse*10+remainder;
			num = num/10;
		}
		
		System.out.println(reverse);
		if (orginal==reverse){
			System.out.println("The given number ia a palindrome");
		}else {
			System.out.println("its not a palindrome");
		}
			
		

		
		
		
	}
}
