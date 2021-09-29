import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestAssured_BDD {

	//RestAssured.baseURI="https://reqres.in/api/Users?page=2
	
	@Test
	public void getUsers()
	{
		given().
		when()
		.get("https://reqres.in/api/Users?page=2")
		.then()
		.statusCode(200);
		
		
		
		
		
	}
}
