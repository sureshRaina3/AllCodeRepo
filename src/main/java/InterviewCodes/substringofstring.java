package InterviewCodes;

public class substringofstring {
	
	public static void main(String[] args) {
		String one = "test123string";
		String two = "123";
		
		
		for (int i=0; i<=one.length()-3;i++) {
			String a = one.substring(i, i+3);
			if (a.equals(two)) {
				System.out.println(a+ " its a sub string");
			}
		}
	}

}
