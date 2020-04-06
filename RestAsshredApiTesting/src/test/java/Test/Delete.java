package Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete
{

@Test
public void deleteEmpRecord() {
		
	String username = "b" ;
		
	RestAssured.baseURI = "https://petstore.swagger.io/v2" ;
	RequestSpecification request = RestAssured.given();	
		
	request.header("Content-Type", "application/json");	
	
	Response response = request.delete("/delete/"+ username);		
		
	int statusCode = response.getStatusCode();
	System.out.println(response.asString());
	Assert.assertEquals(statusCode, 200);
		
	String jsonString =response.asString();
	Assert.assertEquals(jsonString.contains("ssuccessful operation"), true);
	}
}