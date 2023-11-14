package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import components.MenuComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResultPage {

    MainPage main = new MainPage();
    MenuComponent menu = new MenuComponent();
    SelenideElement
            infoRegion = $(".zenregioninfo"),
            iconFavorite = $$(".hotel-wrapper").findBy(text(main.nameHotel)).$(".zen-hotelcard-favorite");
    ElementsCollection titleHotel = $$(byAttribute("data-name", "newTab"));


    public void checkCity() {
        infoRegion.shouldHave(text(main.city));
    }

    public void openCardHotel() {
        titleHotel.findBy(text(main.nameHotel)).click();
    }

    public void addFavorite() {
        iconFavorite.click();
    }

}
