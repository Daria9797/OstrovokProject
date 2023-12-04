package components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MenuComponent {
    public SelenideElement buttonChangeLanguage = $(byAttribute("data-testid", "language-widget-control")),

    fieldEmail = $(byAttribute("name", "email")),

    fieldPassword = $(byAttribute("name", "pass")),
            buttonAvtorization = $(byAttribute("data-testid", "user-widget-sign-in-button"));
    ElementsCollection chooseLanguage = $$(byAttribute("data-testid", "language-widget-item")),
            iconAvtorization = $$(".clickOutside");


    public void changeLanguage(String language) {
        buttonChangeLanguage.click();
        chooseLanguage.findBy(text(language)).click();
    }

    public void openFormAvtorization() {

        iconAvtorization.findBy(text("Войти")).click();
    }
}
