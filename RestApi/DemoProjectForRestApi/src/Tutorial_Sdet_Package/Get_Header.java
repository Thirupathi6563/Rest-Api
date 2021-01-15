package Tutorial_Sdet_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Header {
	
	@Test
	public void gettheheader()
	{
		RestAssured.baseURI="https://www.google.com";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"/maps/place/Hyderabad,+Telangana/@17.4122998,78.2679587,11z/data=!3m1!4b1!4m5!3m4!1s0x3bcb99daeaebd2c7:0xae93b78392bafbc2!8m2!3d17.385044!4d78.486671");
		String responsebody=response.getBody().asString();
		System.out.println("Response body is:"+responsebody);
		String ContentType=response.header("Content-Type");
		System.out.println("Content type is:"+ContentType);
		Assert.assertEquals(ContentType, "text/html; charset=UTF-8");
		
		String CacheControl=response.header("Cache-Control");
		System.out.println("Cache control is:"+ CacheControl);
		Assert.assertEquals(CacheControl, "private, max-age=0");
	
		
		
		}


}
