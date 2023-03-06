package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeTest1 {

    @Test
    void AssertionElementsDevTools(){
        //переходим на страницу гита и вводим в поле поиска selenide и жмём enter
        open("https://github.com/");
        $("[data-scoped-placeholder=Search]").setValue("selenide").pressEnter();
        //кликаем на первый выпавший элемент
        $(".repo-list li a").click();
        //переходим в раздел wiki
        $("[data-tab-item=i5wiki-tab]").click();
        //проверяем наличие Soft assertions
        $("#wiki-body").shouldHave(text("Soft assertions"));
        //переходим на Soft assertions
        $("#wiki-body").$(byText("Soft assertions")).click();
        //проверяем наличие примера кода на JUnit5 extension
        $("#wiki-body").shouldHave(Condition.text("JUnit5 extension - com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }
}
