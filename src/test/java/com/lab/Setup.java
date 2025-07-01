package com.lab;

import org.junit.jupiter.api.BeforeAll;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;


public class  Setup{
    public static final String BASE_URL = "https://fakestoreapi.com/";

    public static String cartRequestBody() {
        return "{\n" +
               "  \"userId\": 1,\n" +
               "  \"date\": \"2023-10-01T00:00:00.000Z\",\n" +
               "  \"products\": [\n" +
               "    {\n" +
               "      \"productId\": 1,\n" +
               "      \"quantity\": 2\n" +
               "    }\n" +
               "  ]\n" +
               "}";
    }
    public static String updateProductRequestBody() {
        return "{\n" +
               "  \"title\": \"Updated Product\",\n" +
               "  \"price\": 39.99,\n" +
               "  \"description\": \"This is an updated product\",\n" +
               "  \"image\": \"https://example.com/updated_image.jpg\",\n" +
               "  \"category\": \"electronics\"\n" +
               "}";
    }    // ...existing code...

    public static String createProductRequestBody() {
        return "{\n" +
               "  \"id\": 0,\n" +
               "  \"title\": \"string\",\n" +
               "  \"price\": 0.1,\n" +
               "  \"description\": \"string\",\n" +
               "  \"category\": \"string\",\n" +
               "  \"image\": \"http://example.com\"\n" +
               "}";
    }


    public static String createCartRequestBody() {
        return "{\n" +
               "  \"id\": 0,\n" +
               "  \"userId\": 0,\n" +
               "  \"products\": [\n" +
               "    {\n" +
               "      \"id\": 0,\n" +
               "      \"title\": \"string\",\n" +
               "      \"price\": 0.1,\n" +
               "      \"description\": \"string\",\n" +
               "      \"category\": \"string\",\n" +
               "      \"image\": \"http://example.com\"\n" +
               "    }\n" +
               "  ]\n" +
               "}";
    }

    public static String updateCartRequestBody() {
        return "{\n" +
               "  \"id\": 0,\n" +
               "  \"userId\": 0,\n" +
               "  \"products\": [\n" +
               "    {\n" +
               "      \"id\": 0,\n" +
               "      \"title\": \"string\",\n" +
               "      \"price\": 0.1,\n" +
               "      \"description\": \"string\",\n" +
               "      \"category\": \"string\",\n" +
               "      \"image\": \"http://example.com\"\n" +
               "    }\n" +
               "  ]\n" +
               "}";
    }

    public static String createUserRequestBody() {
        return "{\n" +
               "  \"id\": 0,\n" +
               "  \"username\": \"string\",\n" +
               "  \"email\": \"string\",\n" +
               "  \"password\": \"string\"\n" +
               "}";
    }

    public static String updateUserRequestBody() {
        return "{\n" +
               "  \"id\": 0,\n" +
               "  \"username\": \"string\",\n" +
               "  \"email\": \"string\",\n" +
               "  \"password\": \"string\"\n" +
               "}";
    }

    @BeforeAll
    public static void init() {
        RestAssured.filters(new AllureRestAssured());
        
    }
}
