package serializationAndDeserialization;


import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;

import io.restassured.RestAssured;
import pojoClass.ListOfuser;
import pojoClass.Support;
import pojoClass.Users;

public class Deserialization {

	public static void main(String[] args) {
//		https://reqres.in/api/users?page=2

		RestAssured.baseURI = "https://reqres.in";

		ListOfuser listOfUser = given().log().all().queryParam("page", "2").pathParam("path", "users").when()
				.get("api/{path}").then().log().all().extract().as(ListOfuser.class);

		System.out.println("page: " + listOfUser.getPage());
		System.out.println("per_page: " + listOfUser.getPer_page());
		System.out.println("total: " + listOfUser.getTotal());
		System.out.println("total_pages: " + listOfUser.getTotal_pages());

		Support support = listOfUser.getSupport();
		System.out.println("url: " + support.getUrl());
		System.out.println("text: " + support.getText());

		List<Users> userList = listOfUser.getData();

		for (Users user : userList) {
			System.out.println("*****************");
			System.out.println(user.getEmail());
			System.out.println(user.getFirst_name());
		}

		Assert.assertEquals(listOfUser.getData().get(0).getFirst_name(), "Michael");
	}

}