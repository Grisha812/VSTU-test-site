package volgGtu;

import org.example.AppTest;
import org.example.BaseSeleniumPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.support.ui.Sleeper;

public class AuthFs extends AppTest {

    @Test
    @DisplayName("Навигация по сайту. Движение по разделам")
    public void Serfing() throws InterruptedException {
        Navigation navigation = new Navigation();
        navigation.auth();

        Assertions.assertEquals("Университет сегодня", navigation.getTextUniverTitle());
        Assertions.assertEquals("Образование в ВолгГТУ", navigation.getTextObrazTitle());
        Assertions.assertEquals("Наука в ВолгГТУ", navigation.getTextNaukaTitle());
        Assertions.assertEquals("Вопросы перспективного развития", navigation.getTextRazvitTitle());
        Assertions.assertEquals("Сотрудничество", navigation.getTextSouzTitle());
        Assertions.assertEquals("Справочник", navigation.getTextSpravkaTitle());

    }

    @Test
    @DisplayName("Работа поисковой строки")
    public void Searching(){
        String inputSearch = "тестирование";
        MainPage mainPage = new MainPage();
        mainPage.auth(inputSearch);
    }


    @Test
    @DisplayName("Авторизация в файловом хранилище")
    public void checkAutorisation(){
        String loginValue = "fpik";
        String passValue = "guest";
        FileSavePage fileSavePage = new FileSavePage();
        fileSavePage.auth(loginValue, passValue);
    }



}
