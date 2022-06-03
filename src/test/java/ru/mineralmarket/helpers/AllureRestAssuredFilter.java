package ru.mineralmarket.helpers;

import io.qameta.allure.restassured.AllureRestAssured;

public class AllureRestAssuredFilter {
    private static final AllureRestAssured FILTER = new AllureRestAssured();

    private AllureRestAssuredFilter() {
    }

    public static AllureRestAssuredFilter customLogFilter() {
        return InitLogFilter.logFilter;
    }

    public AllureRestAssured withCustomTemplates() {
        FILTER.setRequestTemplate("request.ftl");
        FILTER.setResponseTemplate("response.ftl");
        return FILTER;

    }

    private static class InitLogFilter {
        private static final AllureRestAssuredFilter logFilter = new AllureRestAssuredFilter();
    }
}
