package tutorial.uploadFiles;

import java.io.File;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class UploadFileEx {
//Using https://www.zamzar.com/
	//https://developers.zamzar.com/
	//API KEY: 		e4ee5076b3274de7aa0c92c8c55888025287677e
	
	@Test
	public void uploadFileExample(){
		
		String apiKEY = "e4ee5076b3274de7aa0c92c8c55888025287677e";
		File inputFile = new File(System.getProperty("user.dir")+"/src/test/java/tutorial/uploadFiles/SourceGIF.gif");
		System.out.println(inputFile.length());
		
		given()
			.when();
			
		
	}
	
}