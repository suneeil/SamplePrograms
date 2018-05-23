package walmart.jsonPath.examples;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

import org.testng.annotations.BeforeClass;

public class ExtractXMLResponse {
	static final String APIKEY = "6amstmtpeqw4yrbh4j6zrf26";

	@BeforeClass
	public static void init(){
		RestAssured.baseURI = "http://api.walmartlabs.com";
		RestAssured.basePath = "/v1";
	}
	
	//Extract numItems
		//@Test
		public void test001(){
			int numItems =	given()
					.queryParam("query", "ipod")
					.queryParam("apiKey", APIKEY)
					.queryParam("format", "xml")
					.when()
					.get("/search")
					.then()
					.extract()
					.path("searchresponse.numItems");

			System.out.println("-----------------------------------------------");
			System.out.println("The total number of Items are: "+ numItems);
			System.out.println("-----------------------------------------------");
		}
}
