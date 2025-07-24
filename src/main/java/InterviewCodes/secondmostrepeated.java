package InterviewCodes;

import java.util.HashMap;
import java.util.Map;

public class secondmostrepeated {

	public static void main(String[] args) {
		
		    int arr[] = {1, 2, 3, 3, 3, 3,3,7, 7, 7, 7};
		    int max = 0;
		    int count = 0;
		    int secondmaxvalue = 0;
		    int secondmax = 0;
		    int maxvalue = 0;

		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] != 0) {
		            count = 1;
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    count++;
		                    arr[j] = 0;
		                }
		            }
		            if (max < count) {
		                secondmax = max;
		                secondmaxvalue = maxvalue;
		                max = count;
		                maxvalue = arr[i];
		            } else if (secondmax < count) {
		                secondmax = count;
		                secondmaxvalue = arr[i];
		            }
		        }
		    }
		    System.out.print(secondmaxvalue);
		    Map<Integer,String>name = new HashMap<Integer,String>();
			

	}
	


}
