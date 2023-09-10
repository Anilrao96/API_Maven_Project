package APIProject;


import io.restassured.http.ContentType;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class PostRqst_PojoArray_Main1 {
	
	public static void main(String [] args) {

	//PostRqst_PojoComplex_Address1[]
	PostRqst_PojoComplex_Address1[] addressz = new PostRqst_PojoComplex_Address1[2];
	
	addressz[0] =  new PostRqst_PojoComplex_Address1();
	addressz[1] = new PostRqst_PojoComplex_Address1();
	
	addressz[0].setH_No("345/56");
	addressz[0].setStreet("GTA");
	addressz[0].setZipCode("234567");
	
	
	PojoRqst_PojoArray_BasicInfo BasicInfo = new PojoRqst_PojoArray_BasicInfo();
	BasicInfo.setFirstName("hfhf");
	BasicInfo.setLastName("ndaas");
	BasicInfo.setMentorName("Ram");
	BasicInfo.setId("2345");
	BasicInfo.setCourseName("Aero");
	BasicInfo.setDesignation("engineer");
	BasicInfo.setAddress(addressz);
	
	
			Response Res = given().contentType(ContentType.JSON).body(BasicInfo).when().post("http://localhost:3000/friends");
			
			System.out.println(Res.asString());
	//address[0]=new PostRqst_PojoComplex_Address1();
	
	
	
	}
	


}
