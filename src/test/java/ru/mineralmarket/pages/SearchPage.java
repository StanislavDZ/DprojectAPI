package ru.mineralmarket.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    SelenideElement searchPage = $("#category_22030").$("a");

    @Step("Проверить отображение заголовка")
    public void checkHeadingSearch(String product) {
        searchPage.shouldHave(Condition.text(product));
    }
}
