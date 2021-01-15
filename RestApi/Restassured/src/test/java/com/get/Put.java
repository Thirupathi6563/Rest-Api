package com.get;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
	@Test
	public void test()
	{
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		
		JSONObject json=new JSONObject();
		
		json.put("firstname", "alla");
		json.put("lastname", "thiru");
		json.put("id", 3);
		
		request.body(json.toJSONString());
		Response response=request.put("http://localhost:3000/users/3");
		int code=response.getStatusCode();
		System.out.println(code);
		Assert.assertEquals(code, 200);
	}

}
