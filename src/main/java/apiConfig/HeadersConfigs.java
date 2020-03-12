package apiConfig;

import java.util.HashMap;
import java.util.Map;

public class HeadersConfigs {
	
  Map<String,String> defaultHeader = new HashMap<String, String>();
 
  public Map<String, String> headersConfigs(){
	  
	  defaultHeader.put("Content-Type", "application/json");
	  
	  
	  return defaultHeader;
	  
	  }
  public static void main(String[] args) {
	  HeadersConfigs head = new HeadersConfigs();
	 System.out.println( head.headersConfigs()) ;
	  }
}





