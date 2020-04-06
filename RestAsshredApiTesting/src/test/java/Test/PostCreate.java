
package Test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;


public class PostCreate 
{
	
	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void BeforeCreateUser()
	{
		map.put("username", RestUtilies.getusername());
		map.put("firstName", RestUtilies.getfirstName());
		map.put("lastName", RestUtilies.getlastName());
		map.put("email", RestUtilies.getemail());
		map.put("password", RestUtilies.getpassword());
		map.put("password", RestUtilies.getpassword());
		map.put("phone", RestUtilies.getphone());
		
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        RestAssured.basePath="/user";
				

	}
	
	@Test
	public void createUser()
	{
		given()
		  .contentType("application/json")
		  .body(map)
		
	.when().
	 	post()
	
	.then().
		statusCode(201).
		and().
		body("succescode",equalTo( "successful operation")).
		and().
		body("message",equalTo( "successful operation"));
		
		
	}

}
