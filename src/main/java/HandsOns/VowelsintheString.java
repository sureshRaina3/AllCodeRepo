package HandsOns;

public class VowelsintheString {
	
	public static void main(String[] args) {
		
		int vowels=0; int consenants= 0;
		String name = "Suresh";
		String lowercase   = name.toLowerCase();
		int consenants2=0;
		for (int i=0; i<name.length();i++) {
			 if (lowercase.charAt(i)=='a'||lowercase.charAt(i)=='e'||lowercase.charAt(i)=='i'||
					 lowercase.charAt(i)=='0'||lowercase.charAt(i)=='u') {
				 vowels++;
				 
			 }else if (lowercase.charAt(i)!=' '){
			 consenants++;
			 } 
			 
			 
		}
		System.out.println(" Total Vowels: "+vowels);
		System.out.println(" Total consenants: "+consenants);
		//System.out.println(" Total consenants: "+consenants2);
	}

}
