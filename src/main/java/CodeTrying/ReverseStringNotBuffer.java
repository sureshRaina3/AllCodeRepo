package CodeTrying;

public class ReverseStringNotBuffer {
	public static void main(String[] args) {
		String str = "suresh kumar";
		String rstr= "";
		char ch;
		for (int i =0 ;i<str.length();i++) {
			ch=str.charAt(i);
			//System.out.println(ch);
			rstr=ch+rstr;
		}
		System.out.println(rstr);
//		String str = "hello";
//	StringBuilder sb=new StringBuilder(str);
//	System.out.println(sb.reverse());
	
	
	}
	

}
