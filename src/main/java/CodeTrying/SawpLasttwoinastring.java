package CodeTrying;

public class SawpLasttwoinastring {

	public static void main(String[] args) {
		String s = "Suresh";
		char[]ch = s.toCharArray();
		char last = ch[ch.length-1];
		char beforelast = ch[s.length()-2];
		
		for (int i=0;i<s.length()-2;i++) {
			System.out.print(ch[i]);
			
			
		}
		System.out.print(last);
		System.out.print(beforelast);
		
		
				

	}

}
