package requestPayload;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RegisterUser {

	public static void main(String[] args) throws IOException {
//		https://reqres.in/api/register

		RestAssured.baseURI = "https://reqres.in";

		given().log().all().header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("./src/test/resources/RegisterUserPayload.json")))).when()
				.post("api/register").then().log().all();

	}

}
