import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeAll
    static void beforeAll()
    {
        Configuration.baseUrl="https://ostrovok.ru";
        Configuration.pageLoadStrategy="eager";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("version", "100");
        Configuration.browserSize = System.getProperty("size", "1920x1080");
        Configuration.remote = "https://user1:1234@" + System.getProperty("selenoid_url","selenoid.autotests.cloud/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options",
                Map.<String, Object> of(
                        "enableVNC", true,
                        "enableVideo", true
                ));
        Configuration.browserCapabilities = capabilities;

    }
    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
    @BeforeEach
    void openResourse(){
        open("/");
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        if (!Configuration.browser.equalsIgnoreCase("firefox")){
            Attach.browserConsoleLogs();
        }
        Attach.addVideo();
    }

}
