package InterviewCodes;

public class swap1 {

	public static void main(String[] args) {
		String name="loki";
		char[]list = name.toCharArray();
		char last = list[name.length()-1];
		char []list2 = new char[name.length()];
		list2[0]=last;
		
		for (int i =1;i<name.length();i++) {
			list2[i]=list[i-1];
		}
		for (char each:list2) {
			System.out.println(each);
		}
		
		

	}

}
