package utility;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonUtility {

	public static int getJsonIntValue(Response response, String key) {
		JsonPath jp = new JsonPath(response.asString());
		return jp.getInt(key);
	}

	public static String getJsonStringValue(Response response, String key) {
		JsonPath jp = new JsonPath(response.asString());
		return jp.getString(key);
	}
}