package InterviewCodes;

public class printthemissingnumbers {

	public static void main(String[] args) {
		int[]numbers = {1,5,7,10,15};
		
		
		 for (int i=0;i<numbers.length-1; i++) {
			 for (int j =numbers[i];j<numbers[i+1];j++) {
				 if (numbers[i]!=j)
				 System.out.println(j);
			 } 
		 }
	}
}
