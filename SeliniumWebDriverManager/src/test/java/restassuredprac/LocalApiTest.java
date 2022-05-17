package restassuredprac;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class LocalApiTest {
	
	//@Test
	public void get_User(){
		
		baseURI="http://localhost:3000";
		given().
		get("/users").
		then().statusCode(200).log().all();		
		
	}
	
	//@Test
	public void post_User(){
		
		JSONObject request=new JSONObject();
		request.put("firstname","justin");
		request.put("lastname","beber");
		
		
		baseURI="http://localhost:3000";
		given().
		contentType((ContentType.JSON)).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
	    post("/users").
	    then().
	    statusCode(201);	
		
	}
	
	//@Test
	public void put_User(){
		
		JSONObject request=new JSONObject();
		request.put("firstname","james");
		request.put("lastname","senthil");
		
		
		baseURI="http://localhost:3000";
		given().		
		contentType((ContentType.JSON)).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	    put("/users/1").
	    then().
	    statusCode(200);	
		
	}
	
	//@Test
	public void patch_User(){
		
		JSONObject request=new JSONObject();
		//request.put("firstname","sastry");
		request.put("lastname","senthil");		
		
		baseURI="http://localhost:3000";
		given().		
		contentType((ContentType.JSON)).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	    patch("/users/1").
	    then().
	    statusCode(200);	
		
	}
	
	@Test
	public void delete_User(){	
		
		
		baseURI="http://localhost:3000";
		given().	
	    delete("/users/4").
	    then().
	    statusCode(200);	
		
	}

}
