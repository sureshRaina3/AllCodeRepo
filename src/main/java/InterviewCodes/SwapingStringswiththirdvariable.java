package InterviewCodes;

public class SwapingStringswiththirdvariable {

	
	public static void main (String[]args){
		
		String one = "Hello";
		String two = "world";
		String temp = "";
		
		two = temp;
		temp = one;
		one = two;
		
	System.out.println(one +" and "+two);
		
	}
}
