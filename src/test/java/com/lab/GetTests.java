package com.lab;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetTests {
    @Test
    public void getAllProducts() {
        given()
            .baseUri(Setup.BASE_URL)
            .when()
            .get("products")
            .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void getSingleProduct() {
        given()
            .baseUri(Setup.BASE_URL)
            .when()
            .get("products/1")
            .then()
            .statusCode(200)
            .log().all();
    }
    
}
