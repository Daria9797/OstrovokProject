package pages;

import com.codeborne.selenide.SelenideElement;
import components.MenuComponent;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    MenuComponent menu = new MenuComponent();

    SelenideElement
            titlePage = $(".homepage-howdy-title"),
            fieldSearch = $(byAttribute("data-testid", "destination-input")),
            buttonSearch = $(byAttribute("data-testid", "search-button"));


    public String city = "Москва, Россия";


    public void checkTitleMatchLang(String language, String text) {
        menu.changeLanguage(language);
        titlePage.shouldHave(text(text));
    }

    public void changeLang(String language) {
        menu.changeLanguage(language);
    }

    public void searchHotel() {
        fieldSearch.sendKeys(city);
        buttonSearch.click();
    }

    public void checkFieldsAvtorization() {

        menu.openFormAvtorization();
        menu.fieldEmail.shouldBe(exist, visible);
        menu.fieldPassword.shouldBe(exist, visible);
        menu.buttonAvtorization.shouldBe(exist, visible);

    }
}
