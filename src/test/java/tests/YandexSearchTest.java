package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexSearchTest {

    @Test
    void selenideSearch() {

        open("https://www.yandex.ru/");
        $("#text").val("Selenide").pressEnter();
        $("body").shouldHave(text("selenide.org"));
    }
}
