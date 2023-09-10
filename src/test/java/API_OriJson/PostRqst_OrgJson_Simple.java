package API_OriJson;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_OrgJson_Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject BasicInfo = new JSONObject();
		BasicInfo.put("FirstName", "Raman");
		BasicInfo.put("LastName", "CV");
		BasicInfo.put("Age", "28");
		BasicInfo.put("Id", "3456");
		
		//Response Res = given().contentType(ContentType.JSON).body(BasicInfo.toString()).when().post("http://localhost:3000/friends");
		Response Res = given().contentType(ContentType.JSON).body(BasicInfo.toString()).when().post("http://localhost:3000/friends");
		
		System.out.println(Res.asString());
		System.out.println(Res.getStatusCode());
	}

}
