package InterviewCodes;

public class removeCapitalletters {

	public static void main(String[] args) {
		String Str ="AbcdeFGhiJ";
		String withoutcaps ="";
		char[]ch =Str.toCharArray();
		for (char eachch: ch ) {
			//int asci = (int)eachch;
			//if(asci<90)   ----Alternativemethod
			if (Character.isLowerCase(eachch)) {
				withoutcaps = withoutcaps+eachch;
			}
		}
		System.out.println(withoutcaps);

	}

}
