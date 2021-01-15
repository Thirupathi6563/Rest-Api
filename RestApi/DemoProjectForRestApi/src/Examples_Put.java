import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class Examples_Put {

	public static void main(String[] args) {
		
			JSONObject j=new JSONObject();
			j.put("firstname","sudha");
			j.put("lastname","Gali");
			j.put("Subjectid","4");
			
			baseURI="http://localhost:3000/";
			given().contentType(ContentType.JSON).accept(ContentType.JSON)
			.header("Content-Type","application/json").
			body(j.toJSONString()).
			when().put("/users/4").then().statusCode(200).log().all();
			
			
	}

}
