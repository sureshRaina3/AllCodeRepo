package InterviewCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortingAnArray {

	public static void main(String[] args) {
		
		int []numbers= {1,5,3,2,4};
		for (int i=0;i<numbers.length;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int temp = numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		
		
			
	

	}

}
