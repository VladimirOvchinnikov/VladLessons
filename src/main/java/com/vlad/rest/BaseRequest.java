package com.vlad.rest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.specification.RequestSpecification;

public class BaseRequest {


//    @Getter
//    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static RequestSpecification initRequestSpecification(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder
                .setContentType(ContentType.JSON)
                .setBaseUri("http://localhost:8080/api")
                .setAccept(ContentType.JSON);

        return requestSpecBuilder.build();
    }
}
