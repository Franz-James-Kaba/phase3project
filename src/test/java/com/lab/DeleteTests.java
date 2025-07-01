package com.lab;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteTests {
    @Test
    public void deleteProduct() {
        given()
            .baseUri(Setup.BASE_URL)
            .when()
            .delete("products/55")
            .then()
            .statusCode(200)
            .log().all();
    }
    @Test
    public void deleteCart() {
        given()
            .baseUri(Setup.BASE_URL)
            .when()
            .delete("carts/15")
            .then()
            .statusCode(200)
            .log().all();
    }
    @Test
    public void deleteUser() {
        given()
            .baseUri(Setup.BASE_URL)
            .when()
            .delete("users/51")
            .then()
            .statusCode(200)
            .log().all();
    }
}
