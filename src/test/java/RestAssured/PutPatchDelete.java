package RestAssured;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutPatchDelete {
	@Test
	public void put() {
		
		JSONObject js3 = new JSONObject();
		js3.put("name",  "morpheus");
		js3.put("job", "zion resident");
		
		baseURI="https://reqres.in";
		given()
		.body(js3.toJSONString())
		.when()
		.put("api/users/2")
		.then()
		.statusCode(200)
		.log()
		.all();		
	}
	@Test
	public void patch() {
		
		JSONObject js3 = new JSONObject();
		js3.put("name",  "morpheus");
		js3.put("job", "zion resident");
		
		baseURI="https://reqres.in";
		given()
		.body(js3.toJSONString())
		.when()
		.patch("api/users/2")
		.then()
		.statusCode(200)
		.log()
		.all();		
	}
	@Test
    public void Delete() {
	
		baseURI="https://reqres.in";
		 when()
		.delete("api/users/2")
		.then()
		.statusCode(204)
		.log()
		.all();		
	}

}
