package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class PostRequest {
	
	@Test
	public void postRequest() {
		
		JSONObject json = new JSONObject();
		json.put("username","admin");
		json.put("password","password123");
		System.out.println(json);
		baseURI="https://restful-booker.herokuapp.com";
		given().
		header("Content-Type", "application/json").
        contentType(ContentType.JSON).
        accept(ContentType.JSON).
        body(json.toJSONString()).
		when().
		post("/auth").
		then().
		statusCode(200).
		log().all();
	}
	@Test	
	public void postRequest2() {
		
		JSONObject js = new JSONObject();
		js.put("name", "suresh");
		js.put("job", "leader");
		System.out.println(js);
		baseURI="https://reqres.in/";
		given()
		.body(js.toJSONString())
		//.header("Content-Type", "application/json")
		//.contentType(ContentType.JSON)
		//.accept(ContentType.JSON)
		.when()
		.post("/api/users")
		.then()
		.statusCode(201)
		.log()
		.all();
		
		
	}
		
		
	
	

}
