package tutorial.studentsApp.base;

import io.restassured.RestAssured;

import org.testng.annotations.BeforeClass;

public class TestBase {
	@BeforeClass
	public static void init(){
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
	}
}
