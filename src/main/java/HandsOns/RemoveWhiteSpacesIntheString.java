package HandsOns;

import java.util.Scanner;

public class RemoveWhiteSpacesIntheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String sent = sc.nextLine();
		String Withoutspace = sent.replaceAll("\\s", "");
		System.out.println(Withoutspace);

	}

}
