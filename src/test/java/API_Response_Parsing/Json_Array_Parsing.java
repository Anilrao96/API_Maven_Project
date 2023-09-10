package API_Response_Parsing;
import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.given;
import static io.restassured.response.Response.*;
import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Json_Array_Parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Response res = given().contentType(ContentType.JSON).when().get("http://dummy.restapiexample.com/api/v1/employees");
	
		Response res = given().contentType(ContentType.JSON).when().get("http://dummy.restapiexample.com/api/v1/employees");
		JSONObject jo = new JSONObject(res.asString());
		
		for(int i=0;i<jo.getJSONArray("data").length();i++) {
			
			String record = jo.getJSONArray("data").getJSONObject(i).getString("employee_name").toString();
			System.out.println(record + " "+i);
			
		}
		
		
	}

}
