package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class FirstRestAsuuredAndGetMethod {
	@Test
	public void test() {
		
		Response response=get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getHeader("accept"));
		System.out.println(response.getHeader("authorization"));
		System.out.println(response.getHeader("user-agent"));
		System.out.println(response.getSessionId());
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
	}
	
	@Test
	public void test2() {
		baseURI="https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200).and().body("data[4].first_name", equalTo("George"));
		given().get("/users?page=2").then().statusCode(200)
		.body("data[3].avatar", equalTo("https://reqres.in/img/faces/10-image.jpg"))
		.body("data.last_name", hasItems("Funke","Fields"));
		
	
	}
		
		
		
	

}
