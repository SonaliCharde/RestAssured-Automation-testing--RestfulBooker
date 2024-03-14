package RestfulBooker.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

@Test
public class BDDPUT {
    public void testBDDPUT(){
        String payload = "{  \n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Charde\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        String token = "d35a390b9ce86ac";

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("booking/1598")
                .cookie(token,token)
                .contentType(ContentType.JSON)
                .body(payload).log().all()
                .when().put()
                .then().log().all().statusCode(200)
                .body("firstname", Matchers.anything("James"));
    }
}
