package RestfulBooker.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.ValidatableResponseImpl;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

@Test
public class NonBDDStylePOSTToken {

    // POST Request
    // URL - https://restful-booker.herokuapp.com/auth
    // BODY - PAYLOAD - JSON
    // username- admin
    //password - password 123
    // HEADER - Content Type - application/json
    //Response - Status code 200, token in response body

    public void testNONBDDStylePOSTPositive(){
        RequestSpecification r = RestAssured.given();

        String payload = "{\n" +
                "        \"username\": \"admin\",\n" +
                "        \"password\": \"password123\"\n" +
                "}";
        r.given().baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);

        // Making Req
        Response response = r.when().post();

        // Validation Part
        ValidatableResponse validatableResponse = response.then();
        String responsestring = response.asString();

        System.out.println(responsestring);
        validatableResponse.statusCode(200);



    }
}
