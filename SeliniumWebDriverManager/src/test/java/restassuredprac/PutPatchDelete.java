package restassuredprac;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDelete {
	
	@Test
	public void put_Test() {
		
		JSONObject request=new JSONObject();
		request.put("name","sameera");
		request.put("job","engineer");	
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/api";
		
		given().
		contentType((ContentType.JSON)).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	    put("/users/2").
	    then().
	    statusCode(200);
		
	
	}
	
	@Test
	public void patch_Test() {
		
		JSONObject request=new JSONObject();
		request.put("name","sameera");
		request.put("job","engineer");	
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/api";
		
		given().
		contentType((ContentType.JSON)).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	    put("/users/2").
	    then().
	    statusCode(200).log().all();
		
	
	}
	
	@Test
	public void delete_Test() {			
		
		baseURI="https://reqres.in";
		
		given().		
	    delete("/api/users/2").
	    then().
	    statusCode(204).log().all();
		
	
	}

}
