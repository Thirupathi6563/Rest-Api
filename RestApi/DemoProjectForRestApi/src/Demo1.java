import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseURI = " ";
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).
		body("data.id[1]", equalTo(8)).body("data.first_name", hasItems("Michael","Lindsay")).log().all();

	}

}
