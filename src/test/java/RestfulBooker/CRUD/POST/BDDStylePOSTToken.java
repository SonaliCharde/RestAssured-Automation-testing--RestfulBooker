package RestfulBooker.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BDDStylePOSTToken {

    @Test
    public void BDDStylePOSTPositive(){
        // POST Request
        // URL - https://restful-booker.herokuapp.com/auth
        // BODY - PAYLOAD - JSON
        // username- admin
        //password - password 123
        // HEADER - Content Type - application/json
        //Response - Status code 200, token in response body

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        // Hashmap, Class - Automation ?- Class - 60-70%

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)
                .when().post()
                .then().log().all()
                .statusCode(200).extract().body();

    }
}
