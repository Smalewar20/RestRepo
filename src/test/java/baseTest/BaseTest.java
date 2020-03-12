package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import io.restassured.RestAssured;
import resource.ExtentReporterNG;



@Listeners(ExtentReporterNG.class)
public class BaseTest extends ExtentReporterNG {
	
	@BeforeClass
	
	public void baseTest()
	{
	RestAssured.baseURI= "https://reqres.in/";
	
	
	}
    
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
