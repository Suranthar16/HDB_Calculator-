import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class jsonprocess {
	
	
	public JSONArray jsonread() throws Exception {
		
		JSONArray employeeList = new JSONArray();
		JSONParser jsonParser = new JSONParser();
         
	        try (FileReader reader = new FileReader("D:\\JSON\\info.json"))
	        {
	            //Read JSON file
	            Object obj = jsonParser.parse(reader);
	 
	            employeeList = (JSONArray) obj;
	            System.out.println(employeeList);
	            
	             
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			return employeeList;
	        
	}

}
