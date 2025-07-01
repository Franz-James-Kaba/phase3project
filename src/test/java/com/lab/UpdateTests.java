package com.lab;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

public class UpdateTests {
    @Test
    public void updateProduct() {
        given()
            .baseUri(Setup.BASE_URL)
            .header("Content-Type", "application/json")
            .body(Setup.updateProductRequestBody())
            .when()
            .put("products/1")
            .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void updateCart() {
        given()
            .baseUri(Setup.BASE_URL)
            .header("Content-Type", "application/json")
            .body(Setup.cartRequestBody())
            .when()
            .put("carts/1")
            .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void updateUser() {
        given()
            .baseUri(Setup.BASE_URL)
            .header("Content-Type", "application/json")
            .body(Setup.updateUserRequestBody())
            .when()
            .put("users/5")
            .then()
            .statusCode(200)
            .log().all();
    }
    
}
