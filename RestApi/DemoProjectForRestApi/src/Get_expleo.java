import static io.restassured.RestAssured.*;
public class Get_expleo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseURI="https://zelebackend.herokuapp.com/swagger-ui.html#";
		given().get("/users[1]").then().statusCode(200).log().all();

	}

}
