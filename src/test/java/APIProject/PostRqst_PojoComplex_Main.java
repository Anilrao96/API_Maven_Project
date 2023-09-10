package APIProject;

import io.restassured.http.ContentType;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class PostRqst_PojoComplex_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostRqst_PojoComplex_Address Address = new PostRqst_PojoComplex_Address();
		Address.setH_No("234-10");
		Address.setStreet("Ramadugu");
		Address.setZipCode("123456");
		
		
		PostRqst_PojoComplex_BasicInfo BasicInfo = new PostRqst_PojoComplex_BasicInfo();
		BasicInfo.setFirstName("Rama");
		BasicInfo.setLastName("Rao");
		BasicInfo.setCourseName("Hjajaa");
		BasicInfo.setDesignation("Engineer");
		BasicInfo.setId("123");
		BasicInfo.setMentorName("Viraj");
		BasicInfo.setAddress("Vkp");
		
		Response Res = given().contentType(ContentType.JSON).body(BasicInfo).when().post("http://localhost:3000/friends");
		
		System.out.println(Res.getStatusCode());
		System.out.println(Res.asString());
	}

}
