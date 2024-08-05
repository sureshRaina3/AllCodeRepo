package RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import JsonPayload.DeletemethodJson;
import JsonPayload.PostmethodJson;
import JsonPayload.PutmethodJson;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class EndtoEndAPIAutomation {
	
	public static String plsid;
	
	@Test(priority = 1)
	public void createPlaceUsingpostMethod() {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String Respose=given().log().all().queryParam("key","qaclick123" ).header("Content-Type", "application/json")
		.body(PostmethodJson.name())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("status", equalTo("OK"))
		.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
         System.out.println(Respose);
		
		JsonPath js=new JsonPath(Respose);
		plsid = js.getString("place_id");
		System.out.println(plsid);
		
	}
	@Test(priority = 2)
	public void updatePlace() {
		
		given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json")
		.body(PutmethodJson.put()).put("/maps/api/place/update/json").then().assertThat().statusCode(200)
		.body("msg", equalTo("Address successfully updated"))
		.log().all();
	}
	@Test(priority = 3)	
	public void getPlace() {
		
		given().log().all().queryParam("place_id", plsid).queryParam("key","qaclick123").
		when().get("/maps/api/place/get/json").then().assertThat().statusCode(200).
		body("address", equalTo("70 Summer walk, USA")).log().all();
		
	}
	@Test(priority = 4)
	public void DeletePlace() {
		
		given().log().all().queryParam("key","qaclick123").body(DeletemethodJson.deletemethod()).
		when().delete("/maps/api/place/delete/json").then().assertThat().statusCode(200).
		body("status", equalTo("OK")).log().all();
				
	}
	
	@Test(priority = 5)
	public void gettingtheDeletedPlace() {
		
		given().log().all().queryParam("place_id", plsid).queryParam("key","qaclick123").
		when().get("/maps/api/place/get/json").then().assertThat().statusCode(404).
		body("msg", equalTo("Get operation failed, looks like place_id  doesn't exists")).log().all();
		
	}
	

}
