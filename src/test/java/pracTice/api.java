package pracTice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import io.restassured.response.Response;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class api {
	
	
		@Before
	    public void setup() {
	        RestAssured.baseURI = "https://diseradental.ca";
	    }

	    @Test
	    public void getRequest() {
	        Response response =  given()
	        		.contentType(ContentType.JSON)
	                .when()
	                .get("/testimonials/")
	                .then()
	                .log().all().extract().response();

	        Assert.assertEquals(200, (( response).statusCode()));
	        
	        //"title": "qui est esse",
	        
	       // Assert.assertEquals("qui est esse",response.jsonPath().getString("title[1]"));
		
	
		//*/50 * * * *
	}

}
