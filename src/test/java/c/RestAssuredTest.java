package c;

import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {

//    @Test
    public void testTest(String[] args) {
//        RestAssured.basic("","");


        ResponseBody s = given()
                .spec(BaseRequest.initRequestSpecification())
                .when()
                .get("/getAll")
                .thenReturn()
                .body();

        System.out.println(s.prettyPrint());

    }
}
