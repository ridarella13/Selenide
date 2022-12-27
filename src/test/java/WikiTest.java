import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WikiTest {

    @Test
    void wikiSeach() {
        //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        $("#wiki-pages-box button").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        // Откройте страницу SoftAssertions
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        // проверьте что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
