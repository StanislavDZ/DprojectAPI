package ru.mineralmarket.tests.spec;


import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.aeonbits.owner.ConfigFactory;
import ru.mineralmarket.config.TestsConfig;
import ru.mineralmarket.pages.ApiAddCart;

import static io.restassured.RestAssured.with;
import static ru.mineralmarket.helpers.AllureRestAssuredFilter.customLogFilter;


public class Specification {

    public static final TestsConfig config = ConfigFactory.create(TestsConfig.class, System.getProperties());
    public ApiAddCart ApiAddCart = new ApiAddCart();

    public static RequestSpecification request = with()
            .filter(customLogFilter().withCustomTemplates())
            .log().all()
            .contentType(ContentType.JSON)
            .baseUri(config.baseURI())
            .basePath("/leads_catcher");

    public static ResponseSpecification responseOk = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.ALL)
            .build();

    public static ResponseSpecification responseCreatedOk = new ResponseSpecBuilder()
            .expectStatusCode(201)
            .log(LogDetail.ALL)
            .build();
}
