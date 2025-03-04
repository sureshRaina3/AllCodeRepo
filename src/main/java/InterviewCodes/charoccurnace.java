package InterviewCodes;

public class charoccurnace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="SureshRaina";
		char []nameconvertion = name.toCharArray();
		int count =0;
		int maxcount =0;
		char maxchar = '0';
		
		for (int i =0; i<nameconvertion.length-1; i++){
			count =1;
			for (int j = i+1;j<name.length(); j++){
				
				if (nameconvertion[i]==nameconvertion[j]){
					
					count ++;
					nameconvertion[j]=1;
					
				}	
			}
			if (count > maxcount){
				maxcount = count;
				maxchar = nameconvertion[i];
				
			}
			if ((nameconvertion[i]!=' ')&&nameconvertion[i]!='1') {	
			    System.out.println(nameconvertion[i]+ "-"+ count);
			}
			
			
		}
		System.out.println(maxchar+"-"+maxcount);

	}

}
