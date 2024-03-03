package RestfulBooker.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStyleGETTestNG {

    //Testng -Add
    @Test
            public void testGetAllBookingNegative(){
                RequestSpecification r1 = RestAssured.given();
                r1.baseUri("https://restful-booker.herokuapp.com");
                r1.basePath("/booking/00");
                r1.when().get().body();
                r1.then().log().all().statusCode(404);
            }

            @Test
    public void testGetAllBookingPositive(){
        RequestSpecification r1 = RestAssured.given();
        r1.baseUri("https://restful-booker.herokuapp.com");
        r1.basePath("/booking/869");
        r1.when().get().body();
        r1.then().log().all().statusCode(200);
    }

    @Test
    public void testGetAllBookingNegative1(){
        RequestSpecification r1 = RestAssured.given();
        r1.baseUri("https://restful-booker.herokuapp.com");
        r1.basePath("/booking/-1");
        r1.when().get().body();
        r1.then().log().all().statusCode(404);
    }


}
