package serializationAndDeserialization;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import pojoClass.Booker;
import pojoClass.BookingDate;

public class SerializationBookers {

	public static void main(String[] args) {
//		https://restful-booker.herokuapp.com/booking

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";

		Booker booking = new Booker();

		booking.setFirstname("John");
		booking.setLastname("Bond");
		booking.setTotalprice(4500);
		booking.setDepositpaid(true);
		booking.setAdditionalneeds("Breakfast");

		BookingDate bDate = new BookingDate();
		bDate.setCheckin("2023-03-27");
		bDate.setCheckout("2023-04-20");

		booking.setBookingdates(bDate);

		given().log().all().header("Content-Type", "application/json").pathParam("path", "booking").body(booking).when()
				.post("{path}").then().log().all();

	}

}
