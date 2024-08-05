package HandsOns;

public class AverageofElementinAnArray {

	public static void main(String[] args) {
		
		
		 int sum = 0;
		 
		 int Element[]= {1,2,3,4,5,6,7,8,9,10};
		 for (int i=0; i<Element.length;i++) {
			 sum+=Element[i];
		 }
		 System.out.println("sumation of an arrays is: "+sum);
		 int average = sum/Element.length;
		 System.out.println(average);
		 
				 
		 }

	

}
