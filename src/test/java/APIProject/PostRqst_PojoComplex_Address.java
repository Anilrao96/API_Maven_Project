package APIProject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostRqst_PojoComplex_Address {
	String H_No;
	String Street;
	String ZipCode;
	public String getH_No() {
		return H_No;
	}
	public void setH_No(String h_No) {
		H_No = h_No;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	
	

}
