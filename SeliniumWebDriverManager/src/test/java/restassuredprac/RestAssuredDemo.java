package restassuredprac;



import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class RestAssuredDemo {
	
	@Test
	public void rest_Get(){
		
		Response response=get("https://reqres.in/api/users?page=2");
	
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statuscode=response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
	}
	
	@Test
	public void test_1() {
		
		baseURI="https://reqres.in/api";
	    
	    given().
	    get("/users?page=2").
	    then().
	    statusCode(200).
	    body("data[1].id",equalTo(8)).log().all();
	}

}