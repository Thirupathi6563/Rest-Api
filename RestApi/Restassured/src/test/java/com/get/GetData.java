package com.get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;


public class GetData {
	@Test
	public void getresponsecode()
	{
		Response resp=RestAssured.get("http://api.openweathermap.org/data/2.5/weather?id=524901&lang=fr&appid=78a666b362b9c130549c1e4c37bfddb4");
		
		int code=resp.getStatusCode();
		System.out.println(code);
		Assert.assertEquals(code, 200);
		
	}
	@Test
	public void testbody()
	{
	
		Response resp=RestAssured.get("http://api.openweathermap.org/data/2.5/weather?id=524901&lang=fr&appid=78a666b362b9c130549c1e4c37bfddb4");
		String data=resp.asString();
		System.out.println(data);

	System.out.println(resp.getTime());
	}
	

}
