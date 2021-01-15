import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class Examples_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			baseURI="http://localhost:3000/";
			
			when().delete("/users/4").then().statusCode(200).log().all();
			
			

	}

}
