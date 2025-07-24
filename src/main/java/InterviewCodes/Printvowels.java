package InterviewCodes;

public class Printvowels {

	public static void main(String[] args) {
		String[]input = {"banana","apple","Lemon"};
		
		
		for (String each :input) {
			int count =0;
			for (int i=0;i<each.length();i++) {
				if ((each.charAt(i)=='a')||(each.charAt(i)=='e')||(each.charAt(i)=='i')||(each.charAt(i)=='o')||(each.charAt(i)=='u')) {
					count++;
				}
				
			}
			System.out.println(each+"="+count);
		}

	}

}
