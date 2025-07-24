package InterviewCodes;

public class Addnumbertoeven {

	public static void main(String[] args) {
		int[]num= {1,2,3,4,5};
		for (int eachnum: num) {
			if (eachnum%2==0) {
				System.out.println(eachnum+1);
			}else {
				System.out.println(eachnum);
			}
				
		}

	}

}
