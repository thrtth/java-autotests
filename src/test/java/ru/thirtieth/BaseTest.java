package ru.thirtieth;

import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.Configuration;

public class BaseTest {

    @BeforeEach
    void setUp() {
        Configuration.baseUrl = "https://www.saucedemo.com";
        Configuration.browser = "chrome";
        Configuration.timeout = 5000;

    }
}
