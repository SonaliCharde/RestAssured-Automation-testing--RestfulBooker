package RestfulBooker.CRUD.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

@Test
public class BDDPatch {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token = "cbdacc1c892a8ab";

    @Test
    public void testPUTRequest(){
        // url
        // auth - token , da829f2541bfd38 , headers - json
        // id - 2673
        // payload

        String payload = "{\n" +
                "    \"firstname\": \"Josh\",\n" +
                "    \"lastname\": \"Allen\",\n" +
                "    \"totalprice\": 111,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"super bowls\"\n" +
                "}";
        String payload2 = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        String payloadPatch = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/500");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie(token,token);
        requestSpecification.body(payloadPatch).log().all();

        Response response = requestSpecification.when().log().all().patch();

        //Validitable response

        validatableResponse.statusCode(200);
        validatableResponse.body("firstname", Matchers.equalTo("James"));
        validatableResponse.body("lastname", Matchers.equalTo("Brown"));
    }
}
