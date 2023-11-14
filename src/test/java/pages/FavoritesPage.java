package pages;
import com.codeborne.selenide.SelenideElement;
import components.MenuComponent;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class FavoritesPage {
    MainPage main =new MainPage();
    MenuComponent menu=new MenuComponent();
    SelenideElement titleFavorite=$(By.linkText(main.nameHotel));

    public void checkFavorites(){

        menu.openMenu();
        menu.chooseSectionFavorites();
        titleFavorite.shouldBe(exist,visible);
    }

}
