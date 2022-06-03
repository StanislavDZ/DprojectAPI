package ru.mineralmarket.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    SelenideElement searchPage = $x("//*[@id=\"center_column\"]/div[2]/div/div/h1");

    @Step("Проверить отображение заголовка")
    public void checkHeadingSearch(String product) {
        searchPage.shouldHave(Condition.text(product));
    }
}
