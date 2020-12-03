package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {

  @Test
  void selenideSearch() {

    open("https://www.google.com/");

    $("[name='q']").setValue("Selenide").pressEnter();

    $$("cite").findBy(Condition.exactText("selenide.org")).should(Condition.exist);

  }

}
