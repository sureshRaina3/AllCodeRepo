package InterviewCodes;

public class StoreInArray {

	public static void main(String[] args) {
		
		int index =0;
		int startingnumber=699;
		int endingnumber=800;
		int []storenum= new int[(endingnumber-startingnumber)+1]; 
		for (int i=startingnumber;i<=endingnumber;i++) {
			storenum[index]=i;
			index=index+1;
		}
		
		for (int num:storenum) {
			System.out.println(num);
		}

	}

}
