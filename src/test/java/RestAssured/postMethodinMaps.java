package RestAssured;

import org.testng.annotations.Test;

import JsonPayload.PostmethodJson;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class postMethodinMaps {
	
	
	@Test
	public void post () {
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		given().log().all().queryParam("key","qaclick123" ).header("Content-Type", "application/json")
		.body(PostmethodJson.name())
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("status", equalTo("OK"))
		.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)");
		
		
	}

}
