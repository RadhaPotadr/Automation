package httpRequest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class PostRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://reqres.in";
		
		given().log().all().header("Content-Type","application/json").body("{\r\n" + 
				"    \"name\": \"Tom\",\r\n" + 
				"    \"job\": \"Test Analyst\"\r\n" + 
				"}").when().post("/api/users").then().log().all().assertThat().statusCode(201);
	}

}
