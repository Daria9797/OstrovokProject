import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.FavoritesPage;
import pages.HotelPage;
import pages.MainPage;
import pages.ResultPage;

import static io.qameta.allure.Allure.step;

public class TestOstrovok extends TestBase {

    MainPage main = new MainPage();
    ResultPage result = new ResultPage();
    HotelPage hotel = new HotelPage();
    FavoritesPage favorite = new FavoritesPage();


    @CsvSource(value = {
            "English, Find hotels, hostels, and apartments",
            "Deutsch, Finden Sie Hotels, Apartments und Hostels",
            "Русский, Поиск отелей, хостелов и апартаментов"

    })
    @ParameterizedTest()
    @Tag("BLOCKER")
    @DisplayName("Текст в заголовке соответствует выбранному языку")
    void titleMatchesLanguage(String language, String text) {

        step("Проверяем что текст в заголовке соответствует выбранному языку", () -> {
            main.checkTitleMatchLang(language, text);
        });

    }

    @Test
    @Tag("NORMAL")
    @DisplayName("Результаты поиска соответствуют выбранному городу")
    void resultMatchCity() {

        step("Ищем отель по выбранному городу", () -> {
            main.searchHotel();
        });
        step("Проверяем,что выводятся результаты по выбранному городу ", () -> {
            result.checkCity();
        });
    }


    @Test
    @Tag("BLOCKER")
    @DisplayName("Название отеля в карточке совпадает с выбранным на странице результатов названием")
    void nameHotelMatchResult() {

        step("Ищем отель по выбранному городу", () -> {
            main.searchHotel();
        });
        step("Открываем карточку отеля", () -> {
            result.openCardHotel();
        });

        step("Проверяем соответстствие названия отеля с названием на странице результатов", () -> {
            hotel.checkNameHotel();
        });

    }


    @Test
    @Tag("NORMAL")
    @DisplayName("Понравившийся отель попадает в избранное")
    void hotelMoveFavorite() {

        step("Ищем отель по выбранному городу", () -> {
            main.searchHotel();
        });
        step("Добавляем отель в избранное", () -> {
            result.addFavorite();
        });
        step("Проверяем,что понравившийся отель попал в избранное", () -> {
            favorite.checkFavorites();
        });


    }

    @Test
    @Tag("BLOCKER")
    @DisplayName("В форме авторизации отображаются email,пароль,кнопка входа ")
    void formAvtorizationHasFields() {

        step("Открываем форму авторизации и проверяем наличие email,пароля,кнопки входа ", () -> {
            main.checkFieldsAvtorization();
        });


    }


}
