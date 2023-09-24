package basicValidations;


import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostRequest1 {

	public static void main(String[] args) {
//		https://reqres.in/api/users

		RestAssured.baseURI = "https://reqres.in";

		String userName = "Smith";
		String userJob = "QA Lead";

		Response createUserResponse = given().log().all().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"name\": \"" + userName + "\",\r\n" + "    \"job\": \"" + userJob + "\"\r\n"
						+ "}")
				.when().post("api/users").then().log().all().assertThat().statusCode(201).extract().response();

//		parse the Json object into JsonPath class

		JsonPath jp = new JsonPath(createUserResponse.asString());
		System.out.println("Username is : " + jp.getString("name"));
		Assert.assertEquals(jp.getString("name"), userName);
		
		System.out.println("Userjob is : " + jp.getString("job"));
		Assert.assertEquals(jp.getString("job"), userJob);
	}

}
