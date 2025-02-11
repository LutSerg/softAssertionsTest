package ru.asteroster.enterprizetest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubEnterprizePageTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
//        Configuration.baseUrl = "https://github.com/";
    }

    @Test
    void enterprizePageTest() {
        open("https://github.com/");
         $(".HeaderMenu-nav").$(byText("Solutions")).hover();
         $(".HeaderMenu-dropdown ul li").$(byText("Enterprises")).click();
    }
}
