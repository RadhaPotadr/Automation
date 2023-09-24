package complexJsonHandling;

import io.restassured.path.json.JsonPath;
import utility.Payloads;

public class ComplexJsonValidation extends Payloads {

	public static void main(String[] args) {
//		Use parser to parse the Json body
		JsonPath jp = new JsonPath(complexPayload());

//		read and print the value of purchaseAmount
		int purchaseAmount = jp.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount : " + purchaseAmount);

//		read and print the value of website
		String website = jp.getString("dashboard.website");
		System.out.println("Website : " + website);

//		print the number of courses
		int numberOfCourses = jp.getInt("courses.size()");
		System.out.println("Number of courses : " + numberOfCourses);

//		read and print the title of first course
		System.out.println("First course title :" + jp.getString("courses[0].title"));

//		read and print the price and copies of first course
		System.out.println("Price of first course : " + jp.getInt("courses[0].price"));
		System.out.println("Number of copies of first course : " + jp.getInt("courses[0].copies"));

//		print the title of all the courses
		for (int i = 0; i < numberOfCourses; i++) {
			System.out.println((i + 1) + " : " + jp.getString("courses[" + i + "].title"));
		}

		System.out.println("-*********-");
//		print the price of all the courses
		for (int i = 0; i < numberOfCourses; i++) {
			System.out.println(jp.getInt("courses[" + i + "].price"));
		}

//		consider for every call courses are populating at random position, considering this print the price of Playwrit course
		for (int i = 0; i < numberOfCourses; i++) {
			if (jp.getString("courses[" + i + "].title").equals("Playwrit")) {
				System.out.println("Playwrit course price is : " + jp.getInt("courses[" + i + "].price"));
			}
		}

	}

}