package InterviewCodes;

public class mostrepeatedstring {

	public static void main(String[] args) {
		String[]fruits= {"banana","apple","orane"};
		mostrepeatedstring m = new mostrepeatedstring();
		String max=m.rturnrepeatedstring(fruits);
		System.out.println(max);
		
		
		

	}
	public String rturnrepeatedstring(String[]fruit) {
		String MaxString ="" ;
		int tempcount =0;
		int maxcount =0;
		for(int i=0;i<fruit.length;i++) {
			String eachfruit=fruit[i];
			
			for(int j =0;j<eachfruit.length()-1;j++) {
				for (int k =j+1;k<eachfruit.length();k++) {
					if (eachfruit.charAt(j)==eachfruit.charAt(k)&&eachfruit.charAt(k)!='0') {
						tempcount++;
						//eachfruit.replace();
					}
				}
			}
			if (tempcount>maxcount) {
				tempcount=maxcount;
				MaxString=eachfruit;
				tempcount=0;
				
			}
		}
		
		
		
		return MaxString;
		
	}

}
