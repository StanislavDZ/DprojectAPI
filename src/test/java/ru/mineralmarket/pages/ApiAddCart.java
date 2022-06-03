package ru.mineralmarket.pages;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import ru.mineralmarket.tests.spec.Specification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;
import static ru.mineralmarket.listeners.CustomAllureListener.withCustomTemplates;


public class ApiAddCart {

    @Step("Добавление в корзину через Api")
    public Response addToCartButton472868() {
        return given()
                .spec(Specification.request)
                .filter(withCustomTemplates())
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("product_id=472789&visitor_uuid=f9b30810-ec08-4113-8924-999173f1ea2d")
                .when().post("/add_to_cart")
                .then().spec(Specification.responseOk)
            //    .body("product_id", is(("472868")))
           //     .body("visitor_uuid", is(("f9b30810-ec08-4113-8924-999173f1ea2d")))
                .extract().response();

    }

}
