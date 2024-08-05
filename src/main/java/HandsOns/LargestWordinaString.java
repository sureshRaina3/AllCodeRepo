package HandsOns;

public class LargestWordinaString {
	
	public static void main(String[] args) {
		
		int max= 0;
		String largestWord = null;
		
		String Sentence = " my name is sureshKumar and i am working at Cognizant";
		String[]SplitSentence =Sentence.split("\\s");
		
		
		for(int i=0; i<SplitSentence.length;i++ ) {
			if (max<SplitSentence[i].length()) {
				max=SplitSentence[i].length();
				largestWord=SplitSentence[i];	
			}
			
		}
		System.out.println(largestWord);
	}

}
