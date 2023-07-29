/*
 * import java.io.FileNotFoundException; import java.io.FileReader; import
 * java.io.IOException; import java.text.ParseException;
 * 
 * import org.json.simple.JSONArray; import org.json.simple.JSONObject; import
 * org.json.simple.parser.JSONParser; public class jsonread {
 * 
 * @SuppressWarnings("unchecked") public static void main(String[] args) throws
 * Exception { //JSON parser object to parse read file JSONParser jsonParser =
 * new JSONParser();
 * 
 * try (FileReader reader = new FileReader("D:\\JSON\\HDBinfo1.json")) { //Read
 * JSON file Object obj = jsonParser.parse(reader);
 * 
 * JSONArray employeeList = (JSONArray) obj;
 * System.out.println("re="+employeeList);
 * 
 * //Iterate over employee array for(int i=0;i<employeeList.size();i++) {
 * System.out.println("rs="+employeeList); }
 * 
 * JSONObject objects = getArray.optJSONObject(i);
 * 
 * employeeList.forEach(emp -> parseEmployeeObject((JSONObject) emp));
 * 
 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
 * e) { e.printStackTrace(); } catch (ParseException e) { e.printStackTrace(); }
 * }
 * 
 * private static Object parseEmployeeObject(JSONObject emp) { // TODO
 * Auto-generated method stub return null; }}
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import HDB_DTO.DTO;

public class jsonread {
	public static boolean main(DTO dto) {
		JSONParser parser = new JSONParser();

		try (FileReader reader = new FileReader("D:\\JSON\\HDBinfo1.json")) {
			// Parse the JSON file
			JSONArray InfoList = (JSONArray) parser.parse(reader);

			// Iterate through the JSONArray and process each JSONObject

			String UserName = "";
			String password = "";

			System.out.println("infolist =" + InfoList);
//using for loop.
			for (int i = 0; i < InfoList.size(); i++) {
				JSONObject obj = (JSONObject) InfoList.get(i);
				System.out.println("obj=" + obj);

				JSONObject persion = (JSONObject) obj;
				JSONObject Info = (JSONObject) persion.get("info");

				UserName = (String) Info.get("UserName");
				password = (String) Info.get("Password");

				System.out.println("For UserName: " + UserName);
				System.out.println("For Password: " + password);
				System.out.println("-------------------------");

			}
//using for each loop.
			for (Object obj : InfoList) {
				JSONObject persion = (JSONObject) obj;
				JSONObject Info = (JSONObject) persion.get("info"); // Or use "persion" if using infoObject2

				UserName = (String) Info.get("UserName");
				password = (String) Info.get("Password");

				System.out.println("UserName: " + UserName);
				System.out.println("Password: " + password);
				System.out.println("-------------------------");

			}
			System.out.println(UserName.equals(dto.getUsername()));
			System.out.println(password.equals(dto.getPassword()));

			if (UserName.equals(dto.getUsername()) && password.equals(dto.getPassword())) {
				System.out.println("it contains value");
				return true;

			} else {
				System.out.println("it dose not contains value");
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
}
