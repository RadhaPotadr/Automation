package basicValidations;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PutRequest {

	public static void main(String[] args) {
//		https://reqres.in/api/users/2

		RestAssured.baseURI = "https://reqres.in";

		Response updateUserRes = given().log().all().header("Content-Type", "application/json")
				.pathParam("path1", "users").pathParam("path2", 2)
				.body("{\r\n" + "    \"name\": \"Abhishek\",\r\n" + "    \"job\": \"Product Manager\"\r\n" + "}").when()
				.put("api/{path1}/{path2}").then().log().all().assertThat().statusCode(200).extract().response();

//		how to validate the response body
//		first parse the json response body into JsonPath class object

		JsonPath jp = new JsonPath(updateUserRes.asString());

		String reponseName = jp.getString("name");
		System.out.println(reponseName);

		System.out.println("Job : " + jp.getString("job"));
	}

}

