package CodeTrying;

import java.util.Scanner;

public class Leapyear {
	String cstval= null;
	public void checkCoustomValue() {
		String coustomvalue ="1000.00";
		if(coustomvalue.equals("0.0")||(coustomvalue.equals("0"))) {
			cstval="1000.00";
			
		}else if ((!coustomvalue.equals("0.0")||!(coustomvalue.equals("0"))||!(coustomvalue.equals("1000.00")))){
			cstval= coustomvalue;
		}else if (coustomvalue.equals("1000.00")){
			//coustomvalue=cstval;
			this.cstval=coustomvalue;
		}
		System.out.println("The Coustom Value is "+cstval);	 
		}
	public static void main(String[] args) {
		Leapyear l = new Leapyear();
		l.checkCoustomValue();
	}
}
