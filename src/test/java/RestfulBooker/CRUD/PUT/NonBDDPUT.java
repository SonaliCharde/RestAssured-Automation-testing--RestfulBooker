package RestfulBooker.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;


public class NonBDDPUT {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token = "d35a390b9ce86ac";


    @Test
    public void testPUTRequest(){
        // url
        // auth - token , da829f2541bfd38 , headers - json
        // id - 500
        // payload

        String payload = "{  \n" +
                "    \"firstname\" : \"Sonali\",\n" +
                "    \"lastname\" : \"Charde\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

//        String payloadpatch = "{\n" +
//                "    \"firstname\" : \"James\",\n" +
//                "    \"lastname\" : \"Brown\"\n" +
//                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("booking/1598");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie(token,token);

        //requestSpecification.body(payload).log().all();
        // Patch Request
        requestSpecification.body(payload).log().all();

        Response response = requestSpecification.when().put();

        // Get Validatable response to perform validation
        validatableResponse = response.then().log().all();
        //validatableResponse.statusCode(200);









    }

}
