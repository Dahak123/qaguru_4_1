package github;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RestSelenideContributor {
    @Test
    void andreiSolntsevShouldBeTheBeastContributor(){
        //открыть страницу репозитория Селенида
        open("https://github.com/selenide/selenide");
        //подвести мышку к первому элементу в области Contributors
        $(".Layout-sidebar").$(byText("Contributors"))
                .closest("div").$("ul li").hover();
        //check: в появившимся окошке(оверлей) текст Andrei Solntsev


        sleep(5000);
    }
}
