package StepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class methods {
	
	@Given("I am having the post API")
	public void i_am_having_the_post_api(String docString) {
	    RestAssured.baseURI="http://216.10.245.166";
	    String response=given().log().all().headers("Content-Type","application/json").body(docString.replace("bcd", "fed")).	
	    when().post("Library/Addbook.php").
	    then().assertThat().statusCode(200).log().all().extract().response().asString();
	    System.out.println(response);
	   
	}
	@When("I am hitting the post method")
	public void i_am_hitting_the_post_method() {
	     
		
	}
	@Then("I verify the api result")
	public void i_verify_the_api_result() {
	     
		
	}

}
