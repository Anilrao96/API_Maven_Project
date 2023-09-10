package API_First_Maven_Project.API_First_Maven_Project;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/friends");
		System.out.println("status code "+res.getStatusCode());
		System.out.println("Data is");
		System.out.println(res.asString());
	}

}
