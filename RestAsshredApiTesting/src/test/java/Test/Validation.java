package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Validation {


 @Test
 void googleMapTest()
 {
  
  RestAssured.baseURI="https://petstore.swagger.io/v2";
  
  RequestSpecification httpRequest=RestAssured.given();
  
  Response response=httpRequest.request(Method.GET,"https://petstore.swagger.io/v2/user/a\n" + "");
  
  String responseBody=response.getBody().asString();
  System.out.println("Response Body is:" +responseBody);
  
  String contentType=response.header("Content-Type");
  System.out.println("Content Type is:"+contentType);
  Assert.assertEquals(contentType, "application/xml; charset=UTF-8");
  
  String contentEncoding=response.header("Content-Encoding");
  System.out.println("Content Encoding is:"+contentEncoding);
  Assert.assertEquals(contentEncoding, "gzip");
  
 }
 
}

