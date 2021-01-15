import org.json.simple.JSONObject;
import org.omg.CORBA.Request;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Example_Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject j=new JSONObject();
		j.put("firstname","susmitha");
		j.put("lastname","alla");
		j.put("Subjectid","4");
		
		baseURI="http://localhost:3000/";
		given().contentType(ContentType.JSON).accept(ContentType.JSON)
		.header("Content-Type","application/json").
		body(j.toJSONString()).
		when().post("/users").then().statusCode(201).log().all();
		
		

	}

}
