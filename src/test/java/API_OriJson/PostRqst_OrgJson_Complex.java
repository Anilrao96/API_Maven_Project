package API_OriJson;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_OrgJson_Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject AddressInfo = new JSONObject();
		AddressInfo.put("H_No", "6-36");
		AddressInfo.put("StreetName", "Ontario Lane");
		AddressInfo.put("Age", "28");
		
		JSONObject BasicInfo = new JSONObject();
		BasicInfo.put("FirstName", "Vishnu");
		BasicInfo.put("LastName", "Murthy");
		BasicInfo.put("Age", "28");
		BasicInfo.put("id", "4567");
		BasicInfo.put("Address", AddressInfo);
		
		Response Res = given().contentType(ContentType.JSON).body(BasicInfo).when().post("http://localhost:3000/friends");
		
		System.out.println(Res.asString());
	}

}
