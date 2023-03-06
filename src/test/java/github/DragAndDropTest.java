package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;

public class DragAndDropTest {

    @Test
    void MoveBlockRightTest(){

        //Переходим на страницу задания
        Selenide.open("https://the-internet.herokuapp.com/drag_and_drop");

        //Осуществляем перемещение элемента "А" в элемент "В"
        $("#column-a").dragAndDropTo("#column-b");

        //Проверяем, что элементы действительно поменялись местами
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));

    }
}
