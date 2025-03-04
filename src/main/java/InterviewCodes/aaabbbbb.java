package InterviewCodes;

public class aaabbbbb {

	public static void main(String[] args) {
		String input = "a10b20";
		String[]splitinginputalpha = input.split("\\d+");
		String[]splitinginputnummeric = input.split("\\D+");
		for (String name : splitinginputalpha) {
			
			System.out.println(name);
		}
        for (String name : splitinginputnummeric) {
			
			System.out.println(name);
		}
		//for (int i=0; i < splitinginputalpha.length; i++){
			
			//for ( int j =0 ; j < Integer.parseInt(splitinginputnummeric[i]); j++)
				
			//System.out.print(splitinginputalpha[i]);	
		//}
        Character.isUpperCase('A');

	}

}
