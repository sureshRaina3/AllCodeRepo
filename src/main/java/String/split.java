package String;

public class split {

	public static void main(String[] args) {
		String s = "HI MY NAME IS SURESH";
		String[] split = s.split("\\s");
		for(String splittext: split) {
			if(splittext.matches("SURESH")) {
				System.out.println(splittext);
			}
		}

	}

}
