package basicValidations;


import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) {
//		https://reqres.in/api/users?page=2

		RestAssured.baseURI = "https://reqres.in";

		Response getUserRes = given().queryParam("page", 2).log().all().when().get("api/users").then().assertThat()
				.statusCode(200).log().all().extract().response();

		System.out.println("Status code is : " + getUserRes.getStatusCode());

		System.out.println("Status line is : " + getUserRes.getStatusLine());

		System.out.println("CF-RAY header : " + getUserRes.header("CF-RAY"));

		System.out.println("Response Body : " + getUserRes.asPrettyString());
	}

}
