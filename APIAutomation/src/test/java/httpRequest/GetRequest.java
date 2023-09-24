package httpRequest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class GetRequest {

	public static void main(String[] args) {
		
//			https://reqres.in/api/users?page=2

			RestAssured.baseURI = "https://reqres.in";

			given().queryParam("page", 2).log().all().when().get("api/users").then().assertThat().statusCode(200).log()
					.all();
		}
	}

