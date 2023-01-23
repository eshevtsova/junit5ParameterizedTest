package simbitsoft.eshevtsova.tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PositronicaMainPage {

    public PositronicaMainPage openMainPage() {
        open("https://positronica.ru/");
        return this;
    }

    public PositronicaMainPage choseTab(String tabName) {
        $(".dropdown-submenu").$(byText(tabName)).click();
        return this;
    }

    public PositronicaMainPage checkTabName(String tabName) {
        $(".catalog-top-menu__title").shouldHave(text(tabName));
        return this;
    }

    public PositronicaMainPage clickItemWithNumber(int number) {
        $(".dropdown-toggle", number).click();
        return this;
    }
}
