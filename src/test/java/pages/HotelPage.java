package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HotelPage {

    MainPage main=new MainPage();
    SelenideElement headerCardHotel = $("h1 .zen-roomspage-title-name");
    public void checkNameHotel() {
        headerCardHotel.shouldHave(text(main.nameHotel));
    }


}
