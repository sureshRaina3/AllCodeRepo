package InterviewCodes;

public class SringReverseandPalindrome {

	
	
	public static void main (String[]args){
		
		String name ="mom";
		String Reverse = "";
		char ch;
		
		for(int i=0; i< name.length(); i++){
			
			ch = name.charAt(i);
			Reverse = ch+Reverse;
			
	}
	System.out.println(Reverse);

	if (name.equals(Reverse)){
		System.out.println("Its a Palindrome");
	}else {
		System.out.println("Its not a Palindrome");
	}
	}
}
