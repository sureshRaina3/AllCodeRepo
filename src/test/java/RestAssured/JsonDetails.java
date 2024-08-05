package RestAssured;

import org.testng.annotations.Test;

import JsonPayload.CourePricejson;
import io.restassured.path.json.JsonPath;

public class JsonDetails {
	
	@Test
	public void fetchingJson () {
		
		JsonPath Js = new JsonPath(CourePricejson.courseprice());
		int courseSize=Js.getInt("courses.size()");
		System.out.println(courseSize);//Print course size
		int purchaseamont = Js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseamont); // print purchase amount
		String firstcourse = Js.getString("courses[0].title");
		System.out.println(firstcourse);// print first course title
		
		for(int i =0; i<courseSize; i++) {//print course title and price
		  String courses = Js.getString("courses["+i+"].title");
		  String price = Js.getString("courses["+i+"].price");
		  
		  System.out.println(courses+","+price);
		  
			
		}
		int Rpapages = Js.getInt("courses[2].copies");//Print RPA course price
		System.out.println(Rpapages);
		
		int sum=0;
		
		for(int i =0; i<courseSize; i++) {//print course title and price
			  
			  int price = Js.getInt("courses["+i+"].price");
			  int copies =Js.getInt("courses["+i+"].copies");
			  int totalprice = price*copies;
			  sum+=totalprice;
			  System.out.println(sum);
			 
		
	}
		if (sum==purchaseamont) {
			System.out.println("purchase amount and the total cost is equal");
		}else {
			System.out.println("Its not equal");
		}
	}

}
