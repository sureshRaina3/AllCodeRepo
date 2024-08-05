package CodeTrying;

import java.util.Scanner;

public class NoOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String S= sc.nextLine();
		String WithoutSpace = S.replaceAll("\\s", "");
		System.out.println(WithoutSpace.length());

	}

}
