package InterviewCodes;

public class firstnonrepeatedchar {

	public static void main(String[] args) {
		
		String name ="swiss";
		int count=0;
		System.out.println(name.length());
		
		
		
		for (int i=0;1<name.length();i++) {
			
			for (int j=i; j<name.length();j++) {
				if (name.charAt(i)==name.charAt(j)) {
					count++;
					
				}
				
			}
			if (count == 1) {
				System.out.println(name.charAt(i));
				break;
			}else if (count >1) {
				count=0;
			}
			
		}
		

	}

}
