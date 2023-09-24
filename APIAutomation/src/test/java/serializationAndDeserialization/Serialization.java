package serializationAndDeserialization;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import pojoClass.LoginPayload;

public class Serialization {

	public static void main(String[] args) {
//		https://reqres.in/api/login

		RestAssured.baseURI = "https://reqres.in";

//		create the object of pojo class first
		LoginPayload login = new LoginPayload();

//		using setter method set the values of required variables
		login.setEmail("eve.holt@reqres.in");
		login.setPassword("admin123");

		given().log().all().header("Content-Type", "application/json").pathParam("path", "login").body(login).when()
				.post("api/{path}").then().log().all();
	}

}
