package InterviewCodes;

public class sumofdigitsinastring {

	public static void main(String[] args) {

			String name = "suresh1234";
			int sum =0;
			char[]stringtoarray = name.toCharArray();
			for (int i=0; i< stringtoarray.length; i++){
				if (Character.isDigit(stringtoarray[i])) {
					int a =stringtoarray[i]-'0';
					System.out.println(a);
					sum+=a;
				}
				
			}
			System.out.println(sum);
				
				
			
			
			
			
		

	}

}
