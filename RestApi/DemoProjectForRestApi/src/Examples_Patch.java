import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class Examples_Patch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			// TODO Auto-generated method stub
			JSONObject j=new JSONObject();
			
			j.put("firstname","vasu");
			j.put("lastname", "gottam");
			j.put("subjectid", 4);
			
			
			baseURI="http://localhost:3000/";
			given().contentType(ContentType.JSON).accept(ContentType.JSON)
			.header("Content-Type","application/json").
			body(j.toJSONString()).
			when().patch("/users/4").then().statusCode(200).log().all();
			
			
	}

}
