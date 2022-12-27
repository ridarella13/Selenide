import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
    @Test
    void successfulDragAndDrop() {
        //Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Перенесите прямоугольник А на место В
        $("#column-a").dragAndDropTo($("#column-b"));
        //actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(300, 300).release().perform(); //не работает
        //Проверьте, что прямоугольники действительно поменялись
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));
    }
}
