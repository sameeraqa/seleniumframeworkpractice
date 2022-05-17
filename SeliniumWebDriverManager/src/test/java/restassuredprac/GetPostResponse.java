package restassuredprac;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


@Test
public class GetPostResponse {
	
	public void get_Api(){
		baseURI="https://reqres.in/api";
		given().
	    get("/users?page=2").
	    then().
	    statusCode(200).
	    body("data[1].first_name",equalTo("Lindsay")).
		body("data.first_name",hasItems("Lindsay","George"));
		
	}
	
		
	@Test
	public void post_Api() {
		 
		JSONObject request=new JSONObject();
		request.put("name","sameera");
		request.put("job","engineer");	
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/api";
		
		given().
		contentType((ContentType.JSON)).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	    post("/users").
	    then().
	    statusCode(200).log().all();
		
	}

}
