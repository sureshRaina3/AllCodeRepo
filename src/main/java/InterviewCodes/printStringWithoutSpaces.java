package InterviewCodes;

public class printStringWithoutSpaces {
	
	public static void main(String[] args) {
		String name= "I Love Coding With Java";
		String []Splitnmae =name.split("\\s");
		int countofspces = Splitnmae.length-1;
		System.out.println("Total spaces in the string "+countofspces);
		for (int i=0;i<Splitnmae.length;i++) {
			System.out.print(Splitnmae[i]);
		}
	}
	
	

}
