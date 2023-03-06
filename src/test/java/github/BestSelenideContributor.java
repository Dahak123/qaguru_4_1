package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestSelenideContributor {
    @Test
    void andreiSolntsevShouldBeTheBeastContributor(){
        //открыть страницу репозитория Селенида
        open("https://github.com/selenide/selenide");
        //подвести мышку к первому элементу в области Contributors
        $(".Layout-sidebar").$(byText("Contributors"))
                .closest("div").$("ul li, 0").hover();
        //check: в появившимся окошке(оверлей) текст Andrei Solntsev
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));


        sleep(5000);
    }
}
