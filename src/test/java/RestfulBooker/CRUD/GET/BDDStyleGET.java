package RestfulBooker.CRUD.GET;

import io.restassured.RestAssured;

import java.util.regex.Matcher;

public class BDDStyleGET {
    public static void main(String[] args) {
        // GET Request - https://api.zippopotam.us/IN/560037
        // URL
        // HEADER ?
        // GET Method
        // base url = https://api.zippopotam.us
        // basePath = /IN/560037
        // PaYLOAD - ? NO
        // Auth - Basic, Digest, JWT, Bearer Token, OAuth 2.0 ? = No

        // Verification
        // Status Code
        // Response Body
        // Time, Headers ,Cookies

        // Gherkin -> Given, When, then -> Style ->
        // BDD - Framework different
        // Syntax - Gherkin Syntax - (given, when, then)
        // Non BDD and still Gherkin syntax

//        pm.test("TestCase Name", function(){
//        }) -> DSL belongs Postman Testcase

        // RestAssured.given().when().then() - DSL (Java)


        // given ->
        // URL
        // HEADER ?, Cookies
        // base url = https://api.zippopotam.us
        // basePath = /IN/560037
        // Auth - Basic, Digest, JWT, Bearer Token, OAuth 2.0 ? = No


        // When  ->
        // PaYLOAD - ? NO/yES - JSON. XML  -> String, Hashmap, Object class
        // GET Method



        // Then()
        // Response Validation
        //  Status Code
        //  Response Body
        //  Time, Headers ,Cookies

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")

                .when().log().all()
                .get()

                .then().log().all().statusCode(200);
    }
}
