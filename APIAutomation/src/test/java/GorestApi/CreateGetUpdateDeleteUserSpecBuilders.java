package GorestApi;
import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utility.JsonUtility;

public class CreateGetUpdateDeleteUserSpecBuilders extends JsonUtility {

	public static void main(String[] args) {
//		https://gorest.co.in/public/v2/users

		RestAssured.baseURI = "https://gorest.co.in";

//		How to create RequestSpecBuilder

		RequestSpecification reqSpec = new RequestSpecBuilder()
				.addHeader("Authorization", "Bearer 01efbdf12513806fd583c3819d301165d7144c36b85e0cf272b5d5bc6596db92")
				.addPathParam("path", "users").build();

//		How to create ResponseSpecBuilder
		ResponseSpecification resSpec = new ResponseSpecBuilder().expectStatusCode(200).build();

		Map<String, String> createUser = new HashMap<String, String>();
		String username = "Vinita";
		String gender = "Female";
		String email = "vinita.kumar15@15ce.com";
		String status = "active";

		createUser.put("name", username);
		createUser.put("gender", gender);
		createUser.put("email", email);
		createUser.put("status", status);

//		call create user API
		Response createUserRes = given().log().all().header("Content-Type", "application/json").spec(reqSpec)
				.contentType(ContentType.JSON).body(createUser).when().post("public/v2/{path}").then().log().all()
				.extract().response();

		int userId = getJsonIntValue(createUserRes, "id");
		System.out.println("UserID: " + userId);
		Assert.assertEquals(getJsonStringValue(createUserRes, "name"), username);
		Assert.assertEquals(getJsonStringValue(createUserRes, "email"), email);

//		call get user API
//		https://gorest.co.in/public/v2/users/userId
		given().log().all().pathParam("path1", userId).spec(reqSpec).when().get("public/v2/{path}/{path1}").then().log()
				.all().assertThat().spec(resSpec);

//		call update user API
//		https://gorest.co.in/public/v2/users/userId
		Map<String, String> updateUser = new HashMap<String, String>();
		String updatedUsername = "Vinita Kumar";
		String updatedEmail = "vinita12.kumar@15ce.com";
		String updatedStatus = "active";

		updateUser.put("name", updatedUsername);
		updateUser.put("email", updatedEmail);
		updateUser.put("status", updatedStatus);

		given().log().all().pathParam("path1", userId).spec(reqSpec).contentType(ContentType.JSON).body(updateUser)
				.when().put("public/v2/{path}/{path1}").then().log().all().assertThat().spec(resSpec);

//		call delete user API
//		https://gorest.co.in/public/v2/users/userId
		given().log().all().spec(reqSpec).pathParam("path1", userId).when().delete("public/v2/{path}/{path1}").then()
				.log().all();
	}

}