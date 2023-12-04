package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResultPage {

    MainPage main = new MainPage();
    SelenideElement
            infoRegion = $(".zenregioninfo"),
            iconFavorite = $$(".zen-hotelcard-favorite").first(),
            iconSectionFavorite = $(".zenfilterfavorites-label");

    ElementsCollection titleHotel = $$(byAttribute("data-name", "newTab"));


    public void checkCity() {
        infoRegion.shouldHave(text(main.city));
    }


    public String getName() {
        return titleHotel.first().text();
    }

    public void addFavorite() {
        iconFavorite.click();
    }

    public void openFavorite() {
        iconSectionFavorite.click();
    }

    public void checkFavorite() {
        titleHotel.first().shouldHave(text(getName()));
    }

    public void checkNotExistHotel() {
        titleHotel.first().shouldNotBe(exist, visible);
    }

}
