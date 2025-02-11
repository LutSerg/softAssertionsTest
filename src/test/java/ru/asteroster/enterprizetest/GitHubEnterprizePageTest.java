package ru.asteroster.enterprizetest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubEnterprizePageTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void enterprizePageTest() {
        open("https://github.com/");
         $(".HeaderMenu-nav").$(byText("Solutions")).hover();
         $$(".HeaderMenu-nav ul li").findBy(text("Solutions"))
                 .$(".HeaderMenu-dropdown").shouldHave(text("Enterprises"));
         $$(".HeaderMenu-nav ul li").findBy(text("Solutions"))
                .$$("ul li").findBy(text("Enterprises")).click();
         $("#hero-section-brand-heading").shouldHave(text("The AI-powered" + " " + "developer platform"));
    }
}
