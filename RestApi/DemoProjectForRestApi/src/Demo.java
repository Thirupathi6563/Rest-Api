import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.statusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().toString());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		

	}

}
