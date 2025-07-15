package com.lab;

import org.junit.jupiter.api.BeforeAll;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;


public class  Setup{
    public static final String BASE_URL = "https://fakestoreapi.com/";

    public static String cartRequestBody() {
        return """
               {
                 "userId": 1,
                 "date": "2023-10-01T00:00:00.000Z",
                 "products": [
                   {
                     "productId": 1,
                     "quantity": 2
                   }
                 ]
               }
               """;
    }
    public static String updateProductRequestBody() {
        return """
               {
                 "title": "Updated Product",
                 "price": 39.99,
                 "description": "This is an updated product",
                 "image": "https://example.com/updated_image.jpg",
                 "category": "electronics"
               }
               """;
    }    // ...existing code...

    public static String createProductRequestBody() {
        return """
               {
                 "id": 0,
                 "title": "string",
                 "price": 0.1,
                 "description": "string",
                 "category": "string",
                 "image": "http://example.com"
               }
               """;
    }


    public static String createCartRequestBody() {
        return """
               {
                 "id": 0,
                 "userId": 0,
                 "products": [
                   {
                     "id": 0,
                     "title": "string",
                     "price": 0.1,
                     "description": "string",
                     "category": "string",
                     "image": "http://example.com"
                   }
                 ]
               }
               """;
    }

    public static String updateCartRequestBody() {
        return """
               {
                 "id": 0,
                 "userId": 0,
                 "products": [
                   {
                     "id": 0,
                     "title": "string",
                     "price": 0.1,
                     "description": "string",
                     "category": "string",
                     "image": "http://example.com"
                   }
                 ]
               }
               """;
    }

    public static String createUserRequestBody() {
        return """
               {
                 "id": 0,
                 "username": "string",
                 "email": "string",
                 "password": "string"
               }
               """;
    }

    public static String updateUserRequestBody() {
        return """
               {
                 "id": 0,
                 "username": "string",
                 "email": "string",
                 "password": "string"
               }
               """;
    }

    @BeforeAll
    public static void init() {
        RestAssured.filters(new AllureRestAssured());
        
    }
}
