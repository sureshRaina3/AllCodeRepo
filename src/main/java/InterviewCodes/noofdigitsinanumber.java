package InterviewCodes;

public class noofdigitsinanumber {

	
	public static void main(String[]args){
		int number =1043 , count=0;
		
		while(number!=0){
			count++;
			number=number/10;
		}
		
		System.out.println(count);
		
	}

}
