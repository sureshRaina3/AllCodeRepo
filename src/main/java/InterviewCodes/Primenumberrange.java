package InterviewCodes;

public class Primenumberrange {
	
	
	public static void main(String[]args){
		
		
		int startingnumber =1;
		int endingnumber =30;
		int count=0;
		
		for (int i = startingnumber; i<=endingnumber;i++){
			
			for (int j=1; j<=i/2;j++){
				
				if (i%j==0){
					
					count++;
				}
				
			}
			if (count==1){
				System.out.println(i);
				count =0;
				
			}else {
				count=0;
			}
				
			
			
		}
		
		
	}
	
}