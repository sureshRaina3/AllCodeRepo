package RestAssured;

import org.testng.annotations.Test;

import JsonPayload.LibraryJson;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class LibraryparmeterisedBody {
	@Test
	public void Librarypost() {
		
		RestAssured.baseURI="http://216.10.245.166";
		Response ResponseLibrary=given().headers("Content-Type","application/json").
		body(LibraryJson.postLibrary("sure", "225")).
		when().
		post("Library/Addbook.php").
		then().log().all().assertThat().statusCode(200).extract().response();
		
		JsonPath js = new JsonPath(ResponseLibrary.asString());
		String Id=js.get("ID");
		System.out.println(Id);
		
	}

}
