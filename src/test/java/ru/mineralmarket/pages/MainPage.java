package ru.mineralmarket.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {
    SelenideElement
            promoButton = $("#shiny_new_menu").$("li", 1).$("a"),
            shopSaleButton = $("#shiny_new_menu").$("li", 0).$("a"),
            cartButton = $("#cart_block"),
            catalogCollectionsButton = $("#category_676").$("a"),
            search = $("#search_query_top");


    @Step("Открыть главную страницу.")
    public MainPage openPage() {
        open("/");
        return this;
    }

    @Step("Кликнуть на вкладку 'Не забудьте вашу скидку!'")
    public void promoButtonClick() {
        promoButton.click();
    }

    @Step("Кликнуть на вкладку 'Распродажа'")
    public void shopButtonClick() {
        shopSaleButton.click();
    }

    @Step("Кликнуть на 'Коллекционные минералы'")
    public void catalogButtonClick() {
        catalogCollectionsButton.click();
    }

    @Step("Проверить редирект на страницу {url}")
    public void checkPageUrl(String url) {
        String urlPage = WebDriverRunner.url();
        assertEquals(urlPage, url);
    }

    @Step("Ввести в поиск запрос {}")
    public void catalogButtonClick(String product) {
        search.setValue(product);
        search.submit();
    }
}
