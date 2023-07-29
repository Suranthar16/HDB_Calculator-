package HDB_DAO;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import HDB_DTO.DTO;

public class DAO {
	public boolean calculator(DTO dto) {
		
		

		
		
		return false;
		
	}
	public class JSONRead {
		   public static void main(String[] args) {
		      JSONParser parser = new JSONParser();
		      try {
		         Object obj = parser.parse(new FileReader("D:\\JSON\\HDBinfo1.txt"));
		         JSONObject jsonObject = (JSONObject)obj;
		         
		         JSONArray HDB_Info = (JSONArray)jsonObject.get("HDB_Info");
		        
		         Iterator iterator = HDB_Info.iterator();
		         while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		         }
		      } catch(Exception e) {
		         e.printStackTrace();
		      }
		   }
		}
}
