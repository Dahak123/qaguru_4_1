package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchSelenideRepo {

    @Test
    void shouldFindSelenideRepoInGithub(){
        //перейти на страницу гита
        Selenide.open("https://github.com/");
        //в строке поиска ввести selenide
        $("[data-scoped-placeholder=Search]").setValue("selenide").pressEnter();
        //кликнуть на первый выпадающий из поиска элемент
        $$(".repo-list li").first().$("a").click(); //$(".repo-list li a").click(); - либо так
        //проверить элемент на подлинность
        $(".wb-break-word").shouldHave(text("selenide / selenide"));
    }
}












































