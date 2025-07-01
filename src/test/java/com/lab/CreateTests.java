package com.lab;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

public class CreateTests {
    
    @Test
    public void createProduct() {
        given()
            .baseUri(Setup.BASE_URL)
            .header("Content-Type", "application/json")
            .body(Setup.createProductRequestBody())
            .when()
            .post("products")
            .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void createCart() {
        given()
            .baseUri(Setup.BASE_URL)
            .header("Content-Type", "application/json")
            .body(Setup.createCartRequestBody())
            .when()
            .post("carts")
            .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void createUser() {
        given()
            .baseUri(Setup.BASE_URL)
            .header("Content-Type", "application/json")
            .body(Setup.createUserRequestBody())
            .when()
            .post("users")
            .then()
            .statusCode(200)
            .log().all();
    } 
}