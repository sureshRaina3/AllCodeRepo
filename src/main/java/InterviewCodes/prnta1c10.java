package InterviewCodes;

public class prnta1c10 {
	
	public static void main(String[] args) {
		
		String a= "a1cd10d11";
		
		String []x = a.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		
		
		int total = x.length;
		System.out.println(total);
		
		for (int i =0; i<total/2;i++) {
			for (int j=0;j< Integer.parseInt(x[((i*2)+1)]); j++) {
				System.out.print(x[i*2]);
					
				}	
			}
		}
}
