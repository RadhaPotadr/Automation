package requestPayload;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class LoginRequest {

	public static void main(String[] args) {
//		https://reqres.in/api/login

		RestAssured.baseURI = "https://reqres.in";

		Map<String, String> payload = new HashMap<String, String>();
		payload.put("email", "eve.holt@reqres.in");
		payload.put("password", "cityslicka");

		given().log().all().header("Content-Type", "application/json").pathParam("path", "login").body(payload).when()
				.post("api/{path}").then().log().all();

	}

}

// JacksonDatabind
// Jackson Annotation
// Jackson Core
// Gson