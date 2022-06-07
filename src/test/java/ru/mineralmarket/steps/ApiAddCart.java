package ru.mineralmarket.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import ru.mineralmarket.spec.Specification;

import static io.restassured.RestAssured.given;
import static ru.mineralmarket.listeners.CustomAllureListener.withCustomTemplates;


public class ApiAddCart {

    @Step("Добавление в корзину simple 472868 через Api")
    public Response addToCartButton472868() {
        return given()
                .spec(Specification.request)
                .filter(withCustomTemplates())
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("product_id=472789&visitor_uuid=f9b30810-ec08-4113-8924-999173f1ea2d")
                .when().post("/add_to_cart")
                .then().spec(Specification.responseOk)
                .extract().response();

    }

    @Step("Добавление в корзину Collection 468469 через Api")
    public Response addToCartButton468469() {
        return given()
                .spec(Specification.request)
                .filter(withCustomTemplates())
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("product_id=468469&visitor_uuid=f9b30810-ec08-4113-8924-999173f1ea2d")
                .when().post("/add_to_cart")
                .then().spec(Specification.responseOk)
                .extract().response();

    }

    @Step("Добавление в корзину VIP 459300 через Api")
    public Response addToCartButton459300() {
        return given()
                .spec(Specification.request)
                .filter(withCustomTemplates())
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("product_id=459300&visitor_uuid=f9b30810-ec08-4113-8924-999173f1ea2d")
                .when().post("/add_to_cart")
                .then().spec(Specification.responseOk)
                .extract().response();

    }
}
