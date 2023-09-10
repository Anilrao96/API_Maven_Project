package API_OriJson;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class PostRqst_OrgJson_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONArray Address1 =new  JSONArray();
		
		JSONObject Primary_AddressInfo = new JSONObject();
		Primary_AddressInfo.put("H_No", "23/345");
		Primary_AddressInfo.put("StreetName", "DownTown");
		Primary_AddressInfo.put("Zip", "789065");
		
		JSONObject Secondary_AddressInfo = new JSONObject();
		Secondary_AddressInfo.put("H_No", "23/000");
		Secondary_AddressInfo.put("StreetName", "AbbeynTown");
		Secondary_AddressInfo.put("Zip", "789000");
		
		Address1.add(0, Primary_AddressInfo);
		Address1.add(1,Secondary_AddressInfo);
		
		
		JSONObject BasicInfo = new JSONObject();
		BasicInfo.put("FirstName", "Tom");
		BasicInfo.put("LastName", "Cruise");
		BasicInfo.put("Age", "26");
		BasicInfo.put("id", "432");
		BasicInfo.put("Address", Address1);
		
		Response Res = given().contentType(ContentType.JSON).body(BasicInfo).when().post("http://localhost:3000/friends");

			System.out.println(Res.asString());
	}

}
