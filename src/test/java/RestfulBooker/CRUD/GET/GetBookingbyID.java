package RestfulBooker.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class GetBookingbyID {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;

@Test
    public void ByID(){
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/418");

        Response response= requestSpecification.when().log().all().get();

        validatableResponse = response.then().assertThat().statusCode(200);
        validatableResponse = response.then().log().body();


    }
}
