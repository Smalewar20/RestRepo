package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnv {

	public static Map<String, String> fileNenv = new HashMap<String, String>();
	public static Properties propMain = new Properties();
	public static Properties propSet = new Properties();

	public static Map<String, String> endFile(){
		
		String environment = System.getProperty("env");
		
		try {
			
			 if(environment.equalsIgnoreCase("dev"))
               {
				 FileInputStream fisdev = new FileInputStream(System.getProperty("user.dir")+"/input/dev.properties");
			     propMain.load(fisdev);
			      fileNenv.put("ServerUrl",propMain.getProperty("ServerUrl"));
			      fileNenv.put("UserName",propMain.getProperty("UserName"));
			      fileNenv.put("password",propMain.getProperty("password"));
			      fileNenv.put("port",propMain.getProperty("port"));
			    }
			else if (environment.equalsIgnoreCase("qa")) {
				
		        FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir")+"/input/qa.properties");
				propMain.load(fisqa);
				fileNenv.put("ServerUrl",propMain.getProperty("ServerUrl"));
			     fileNenv.put("UserName",propMain.getProperty("UserName"));
			     fileNenv.put("password",propMain.getProperty("password"));
			     fileNenv.put("port",propMain.getProperty("port"));
			 }
			 
		}
			catch (Exception e) {
				// TODO: handle exception
			}
			
				
			  return fileNenv;
			  
	}
		
		
		public static Map<String,String> getConfigReader(){
			
			if(fileNenv == null)
			{
				fileNenv= endFile();
			}
			
			
			
			return fileNenv;
			}
		}
		

		

