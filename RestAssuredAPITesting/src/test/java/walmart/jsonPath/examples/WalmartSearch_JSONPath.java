package walmart.jsonPath.examples;

import io.restassured.RestAssured;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class WalmartSearch_JSONPath {
	static final String APIKEY = "6amstmtpeqw4yrbh4j6zrf26";
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI = "http://api.walmartlabs.com";
		RestAssured.basePath = "/v1";
	}
	
	//Extract numItems
	@Test
	public void test001(){
	int numItems =	given()
			.queryParam("query", "ipod")
			.queryParam("apiKey", APIKEY)
			.queryParam("format", "json")
		.when()
			.get("/search")
		.then()
			.extract()
			.path("numItems");
			
			
			
		System.out.println("-----------------------------------------------");
			System.out.println("The total number of Items are: "+ numItems);
		System.out.println("-----------------------------------------------");
	}
	//Extract Query
	@Test
	public void test002(){
	String queryVal=	given()
		.queryParam("query", "ipod")
		.queryParam("apiKey", APIKEY)
		.queryParam("format", "json")
	.when()
		.get("/search")
	.then()
		.extract()
		.path("query");
		System.out.println("-----------------------------------------------");
			System.out.println("The Search Query is: "+ queryVal);
		System.out.println("-----------------------------------------------");
	}
}