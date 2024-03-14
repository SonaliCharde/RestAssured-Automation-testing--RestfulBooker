package RestfulBooker.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetAllbookings {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;

    @Test
    public void GetbookingsAll(){
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        //requestSpecification.when().get();
        //requestSpecification.then().log().all().statusCode(200);

        Response response = requestSpecification.when().get().prettyPeek();
        validatableResponse = response.then().assertThat().statusCode(200);



    }
}
