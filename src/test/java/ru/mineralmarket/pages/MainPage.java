package ru.mineralmarket.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {
    SelenideElement
            promoButton = $x("//*[@id=\"shiny_new_menu\"]/li[2]/a"),
            shopSaleButton = $x("//*[@id=\"shiny_new_menu\"]/li[1]/a"),
            cartButton = $x("//*[@id=\"cart_block\"]"),
            catalogCollectionsButton = $x("//*[@id=\"category_676\"]/a"),
            search = $x("//*[@id=\"search_query_top\"]");


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

    @Step("Перейти в корзину")
    public void clickYes() {
        cartButton.click();
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
