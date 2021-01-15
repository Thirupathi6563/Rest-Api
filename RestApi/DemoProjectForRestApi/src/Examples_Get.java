import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class Examples_Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	baseURI = "http://localhost:3000/";
	given().
	param("name","automation").
	get("/subjects").then().statusCode(200).log().all();
		

	}

}
