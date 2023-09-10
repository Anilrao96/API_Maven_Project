package API_Response_Parsing;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;




import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Res_parsing_JsonPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Response Res = given().contentType(ContentType.JSON).body(BasicInfo).when().post("http://localhost:3000/friends");

		
		Response res = given().contentType(ContentType.JSON).when().get("https://dummy.restapiexample.com/api/v1/employees");
		System.out.println(res.asString());
		String dt = res.jsonPath().get("data[5].employee_name").toString();
		System.out.println(dt);
		//String s = res.jsonPath().get("[0].firstName");
		//System.out.println(s);
	}

}
