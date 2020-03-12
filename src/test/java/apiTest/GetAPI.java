package apiTest;

import org.testng.annotations.Test;

import apiConfig.ApiPath;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPI extends BaseTest {
	

    @Test
    public void getAPI()
    { 
    	Response resp = RestAssured.given().when().get(ApiPath.apiPath.GET_SINGLE_USER);
    	
    	
    	
    	
    	
    	
    
    }
   
	/*
	 * @Test
	 * 
	 * public void postAPI() {
	 * 
	 * RestAssured.given().when().headers(head.headersConfigs()).bo }
	 */
    
    
    
    
}
