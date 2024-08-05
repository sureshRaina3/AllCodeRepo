package CodeTrying;

public class ChangeMaximumAccuranceToDollar {

	public static void main(String[] args) {
		
		String Name = "Tomorrow";
		int n=Name.length(),count = 0,maxcount = 0,elememt_having_maximum_freQ=0;
		char[]word= Name.toCharArray();
		for (int i=0;i<n;i++) {
			 
			for (int j=0;j<n;j++) {
				if (word[i]==word[j]) {
					count++;
				}
				
			}
			if (count > maxcount) {
				maxcount=count;
				elememt_having_maximum_freQ =word[i];
			}
		}
		System.out.println(elememt_having_maximum_freQ+" "+ count);
		
		// TODO Auto-generated method stub

	}

}
