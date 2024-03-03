package RestfulBooker.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;

public class NonBDDStyleGET {
    public static void main(String[] args) {
        // GET Request
        // BDD style and Non BDD Style

        // given, when. then () . builder pattern

        // https://restful-booker.herokuapp.com/booking/1

        RequestSpecification r1 = RestAssured.given();
        r1.baseUri("https://restful-booker.herokuapp.com");
        r1.basePath("/booking/531").log().all();
        r1.when().get();
        r1.then().log().all().statusCode(200);

        RequestSpecification r2 = RestAssured.given();
        r2.basePath("https://restful-booker.herokuapp.com");
        r2.basePath("/booking/562");
        r2.when().log().all().get();
        r2.then().log().all().statusCode(200);

        // Testing Framework -> Allow us to execute the Test case
        // 1 main -> it will execute all the testcase that we have mentioned
    }
}
