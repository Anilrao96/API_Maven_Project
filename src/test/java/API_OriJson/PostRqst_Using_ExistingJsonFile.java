package API_OriJson;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONTokener;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class PostRqst_Using_ExistingJsonFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("./API_OriJson/Body.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo = new JSONObject();
		
		
Response res = given().contentType(ContentType.JSON).body(jo.toString()).when().post("http://localhost:3000/friends");
	System.out.println(res.asString());
	System.out.println(res.getStatusCode());
	
	}

}
