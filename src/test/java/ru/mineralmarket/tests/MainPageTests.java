package ru.mineralmarket.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MainPageTests extends TestBase {
    @Test
    @Story("Главная страница МинералМаркет")
    @Feature("UI тесты mineralmarket.ru")
    @DisplayName("Переход на подбор камня-талисмана")
    void goPromoPageTest() {
        mainPage
                .openPage()
                .promoButtonClick();
        mainPage
                .checkPageUrl("https://mineralmarket.ru/opredelenie-kamnya");
    }

    @Test
    @Story("Главная страница МинералМаркет")
    @Feature("UI тесты mineralmarket.ru")
    @DisplayName("Переход на страницу распродажи")
    void goShopPageTest() {
        mainPage
                .openPage()
                .shopButtonClick();
        mainPage.checkPageUrl("https://mineralmarket.ru/rasprodazha");
    }

    @Test
    @Story("Главная страница МинералМаркет")
    @Feature("UI тесты mineralmarket.ru")
    @DisplayName("Переход к коллеционным минералам")
    void goCatalogPageTest() {
        mainPage
                .openPage()
                .catalogButtonClick();
        mainPage
                .checkPageUrl("https://mineralmarket.ru/676-kollektsionnye-mineraly");
    }

    @Test
    @Story("Главная страница МинералМаркет")
    @Feature("UI тесты mineralmarket.ru")
    @DisplayName("Поиск товара")
    void searchProductTest() {
        mainPage
                .openPage()
                .catalogButtonClick("Мужские кольца и печатки");
        searchPage
                .checkHeadingSearch("Мужские кольца и печатки");
    }

    @Test
    @Story("Бэк API МинералМаркет")
    @Feature("API тесты mineralmarket.ru")
    @DisplayName("Добавление корзину товара 472868")
    public void addToCartButton472868() {
        apiAddCart.addToCartButton472868();
    }

    @Test
    @Story("Бэк API МинералМаркет")
    @Feature("API тесты mineralmarket.ru")
    @DisplayName("Добавление корзину товара 468469")
    public void addToCartButton468469() {
        apiAddCart.addToCartButton468469();
    }

    @Test
    @Story("Бэк API МинералМаркет")
    @Feature("API тесты mineralmarket.ru")
    @DisplayName("Добавление корзину товара 468469")
    public void addToCartButton459300() {
        apiAddCart.addToCartButton459300();
    }

}
