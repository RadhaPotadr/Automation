package basicValidations;


import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PutRequest1 {

	public static void main(String[] args) {
//		https://reqres.in/api/users/2

		RestAssured.baseURI = "https://reqres.in";

		String userName = "Onkar";
		String userJob = "Developer";

		JsonPath jp = given().log().all().header("Content-Type", "application/json").pathParam("path1", "users")
				.pathParam("path2", 2)
				.body("{\r\n" + "    \"name\": \"" + userName + "\",\r\n" + "    \"job\": \"" + userJob + "\"\r\n"
						+ "}")
				.when().put("api/{path1}/{path2}").then().log().all().assertThat().statusCode(200).extract().response()
				.jsonPath();

		System.out.println("User name is : " + jp.getString("name"));
		Assert.assertEquals(jp.getString("name"), userName);

		System.out.println("User job is : " + jp.getString("job"));
		Assert.assertEquals(jp.getString("job"), userJob);
	}

}
