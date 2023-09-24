package basicValidations;

import static io.restassured.RestAssured.given;

import java.util.Iterator;
import java.util.List;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class PostRequest {

	public static void main(String[] args) {
//		https://reqres.in/api/users

//		specify the base uri to RestAssured
		RestAssured.baseURI = "https://reqres.in";

//		Construct the request using given, when & then
		Response createUserResponse = given().log().all().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"name\": \"Tom\",\r\n" + "    \"job\": \"Test Analyst\"\r\n" + "}").when()
				.post("api/users").then().log().all().assertThat().statusCode(201).extract().response();

//		how to read and validate the status code
		int statusCode = createUserResponse.getStatusCode(); // Get the status code of the response.
		System.out.println("Status code is : " + statusCode);
		Assert.assertEquals(statusCode, 201);

//		print the status line on the console
		String statusLine = createUserResponse.getStatusLine(); // Get the status line of the response.
		System.out.println("Status line is : " + statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 201 Created");

//		how to validate the response headers
		String header1 = createUserResponse.header("Content-Type");
		System.out.println("Content-Type header : " + header1);
		Assert.assertEquals(header1, "application/json; charset=utf-8");

		System.out.println("Server header : " + createUserResponse.header("Server"));

//		how to get all the response headers
		Headers headers = createUserResponse.getHeaders();
		List<Header> headerList = headers.asList();

		Iterator<Header> itr = headerList.iterator();

		while (itr.hasNext()) {
			Header hd = itr.next();
			System.out.println(hd.getName() + " : " + hd.getValue());
		}

//		print the response body in the console
		System.out.println(createUserResponse.asString());

		System.out.println(createUserResponse.asPrettyString());
	}

}
