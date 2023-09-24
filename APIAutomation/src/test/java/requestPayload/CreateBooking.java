package requestPayload;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateBooking {

	public static void main(String[] args) {
//		https://restful-booker.herokuapp.com/booking

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";

		Map<String, Object> payload = new HashMap<String, Object>();
		payload.put("firstname", "Jim");
		payload.put("lastname", "Brown");
		payload.put("totalprice", 111);
		payload.put("depositpaid", true);
		payload.put("additionalneeds", "Breakfast");

		Map<String, String> bookingdates = new HashMap<String, String>();
		bookingdates.put("checkin", "2018-01-01");
		bookingdates.put("checkout", "2019-01-01");

		payload.put("bookingdates", bookingdates);

		given().log().all().header("Content-Type", "application/json").body(payload).when().post("booking").then().log()
				.all();

	}

}