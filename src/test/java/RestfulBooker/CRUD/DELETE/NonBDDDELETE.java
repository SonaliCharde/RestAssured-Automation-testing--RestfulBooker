package RestfulBooker.CRUD.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;


public class NonBDDDELETE {
    //Booking ID = 500
    //BaseURL = "https://restful-booker.herokuapp.com"
    //Basepath = "/booking/500"
    //Content-Type: application/json
    //Cookie: token = d35a390b9ce86ac

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token = "d35a390b9ce86ac";

    @Test
    public void Test(){
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("booking/418");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        Response response = requestSpecification.when().delete();
        validatableResponse = response.then().log().all();;

        validatableResponse.statusCode(403);


    }
}
