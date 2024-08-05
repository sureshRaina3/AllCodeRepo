package CodeTrying;

public class palindrome {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a text");
		String str ="536";
		String rstr="";
		char ch;
		for (int i =0;i<str.length();i++) {
			ch = str.charAt(i);
			rstr= ch+rstr;
		}
		if(str.toLowerCase().equals(rstr.toLowerCase())) {
			System.out.println("It is a palindrome text");
		}else {
			System.out.println("It is not a palindrome text");
		}

	}

}
