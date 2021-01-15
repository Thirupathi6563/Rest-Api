import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.path.json.JsonPath;

public class Examples_Json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseURI="C:\\Users\\Desireddy\\db.json";
		//JSONObject js=new JSONObject();
		JsonPath jp=new JsonPath(baseURI);
		
		String firstname=jp.get("users[1].firstname");
		System.out.println(firstname);

	}

}
