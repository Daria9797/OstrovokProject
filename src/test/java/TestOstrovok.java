import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.MainPage;
import pages.ResultPage;

import static io.qameta.allure.Allure.step;

public class TestOstrovok extends TestBase {

    MainPage main = new MainPage();
    ResultPage result = new ResultPage();


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

        step("Выбираем отображение контента на русском языке", () -> {
              main.changeLang("Русский");
        });

        step("Ищем отель по выбранному городу", () -> {
            main.searchHotel();
        });
        step("Проверяем,что выводятся результаты по выбранному городу ", () -> {
            result.checkCity();
        });
    }


    @Test
    @Tag("BLOCKER")
    @DisplayName("Понравившийся отель удаляется из избранного")
    void hotelDeleteFavorite() {

        step("Выбираем отображение контента на русском языке", () -> {
            main.changeLang("Русский");
        });

        step("Ищем отель по выбранному городу", () -> {
            main.searchHotel();
        });
        step("Добавляем отель в избранное", () -> {
            result.addFavorite();
        });

        step("Удаляем отель из избранного", () -> {
            result.addFavorite();
        });
        step("Открываем список избранных отелей", () -> {
            result.openFavorite();

        });

        step("Проверяем,что отель удалился из избранного", () -> {
            result.checkNotExistHotel();

        });


    }


    @Test
    @Tag("BLOCKER")
    @DisplayName("Понравившийся отель попадает в избранное")
    void hotelMoveFavorite() {

        step("Выбираем отображение контента на русском языке", () -> {
            main.changeLang("Русский");
        });

        step("Ищем отель по выбранному городу", () -> {
            main.searchHotel();
        });
        step("Добавляем отель в избранное", () -> {
            result.addFavorite();
        });
        step("Открываем список избранных отелей", () -> {
            result.openFavorite();

        });
        step("Проверяем,что понравившийся отель попал в избранное", () -> {
            result.checkFavorite();

        });


    }

    @Test
    @Tag("BLOCKER")
    @DisplayName("В форме авторизации отображаются email,пароль,кнопка входа ")
    void formAvtorizationHasFields() {

        step("Выбираем отображение контента на русском языке", () -> {
            main.changeLang("Русский");
        });

        step("Открываем форму авторизации и проверяем наличие email,пароля,кнопки входа ", () -> {
            main.checkFieldsAvtorization();
        });


    }


}
