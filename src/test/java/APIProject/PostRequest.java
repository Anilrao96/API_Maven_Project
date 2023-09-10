package APIProject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class PostRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POJO_PostReq Data = new POJO_PostReq();
		Data.setFirstName("Anil");
		Data.setLastName("Ram");
		Data.setDesignation("Engineer");
		Data.setMentorName("Krishna");
		Data.setCourseName("API testing");
		Data.setId("435");
		
		
		
		Response Res = given().contentType(ContentType.JSON).body(Data).when().post("http://localhost:3000/friends");
		
		System.out.println("statuc code: "+Res.getStatusCode());
		System.out.println("Data posted is");
		System.out.println(Res.asString());
//json-server --watch 
	}

}
