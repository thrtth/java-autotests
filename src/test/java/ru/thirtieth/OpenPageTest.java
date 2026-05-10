package ru.thirtieth;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class OpenPageTest extends BaseTest {

    Logger logger = LoggerFactory.getLogger(OpenPageTest.class);

    @Test
    void openHomePage() {
        open("/");
        $(".login_logo").shouldHave(text("Swag Labs"));
        logger.info("Open Page");
    }

}
