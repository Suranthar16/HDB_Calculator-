

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class Json_Creation
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        //First Employee
        JSONObject personinfo = new JSONObject();
        personinfo.put("UserName", "Lokesh@gmail.com");
        personinfo.put("Password", "lokesh123");
         
        JSONObject infoObject = new JSONObject(); 
        infoObject.put("info", personinfo);
         
        //Second Employee
        JSONObject personinfo2 = new JSONObject();
        personinfo2.put("UserName", "Suranthar@gmail.com");
        personinfo2.put("Password", "suranthar");
         
        JSONObject infoObject2 = new JSONObject(); 
        infoObject2.put("info", personinfo2);
         
        //Add employees to list
        JSONArray InfoList = new JSONArray();
        InfoList.add(infoObject);
        InfoList.add(infoObject2);
         
        //Write JSON file
        try (FileWriter file = new FileWriter("D:\\JSON\\HDBinfo1.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(InfoList.toString()); 
            file.flush();
            System.out.println("File Write Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}