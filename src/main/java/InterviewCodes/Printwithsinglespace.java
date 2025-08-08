package InterviewCodes;

import java.time.Clock;
import java.util.Scanner;

public class Printwithsinglespace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Input  = sc.nextLine();
		String[]withoutspaces=Input.split("\\s");
		String withsinglespace =null;
		for (int i=0;i<withoutspaces.length;i++) {
			if (withoutspaces[i]!=" ") {
				String withspace = withoutspaces[i]+" ";
				withsinglespace = withsinglespace+withspace;
			}
		}
		System.out.println(withsinglespace);

		
		

	}

}
