package requestPayload;


import io.restassured.RestAssured;
import utility.Payloads;

import static io.restassured.RestAssured.*;

public class CreateUser extends Payloads {

	public static void main(String[] args) {
//		https://reqres.in/api/users

		RestAssured.baseURI = "https://reqres.in";

		String username = "John";
		String userjob = "BA";

		given().log().all().header("Content-Type", "application/json").pathParam("path1", "users")
				.body(createUserPayload(username, userjob)).when().post("api/{path1}").then().log().all();
	}

}
