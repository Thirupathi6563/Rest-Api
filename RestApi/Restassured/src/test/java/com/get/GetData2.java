package com.get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import static io.restassured.RestAssured.*;

public class GetData2 {
	@Test
	public void getresponsecode()
	{
		int code=get("http://api.openweathermap.org/data/2.5/weather?id=524901&lang=fr&appid=78a666b362b9c130549c1e4c37bfddb4").getStatusCode();
		
		//int code=resp.getStatusCode();
		System.out.println(code);
		Assert.assertEquals(code, 200);
		
	}
	@Test
	public void testbody()
	{
	
		String data=get("http://api.openweathermap.org/data/2.5/weather?id=524901&lang=fr&appid=78a666b362b9c130549c1e4c37bfddb4").asString();
		//String data=resp.asString();
		System.out.println(data);

	long time=get("http://api.openweathermap.org/data/2.5/weather?id=524901&lang=fr&appid=78a666b362b9c130549c1e4c37bfddb4").getTime();
	System.out.println(time);
	}
	

}
