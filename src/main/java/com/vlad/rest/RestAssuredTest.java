package com.vlad.rest;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.given;

public class RestAssuredTest {

    public static void main(String[] args) {
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
