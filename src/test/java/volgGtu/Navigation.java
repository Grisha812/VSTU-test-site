package volgGtu;

import org.example.BaseSeleniumPage;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Navigation extends BaseSeleniumPage {

    @FindBy(xpath = "(//span[contains(text(),'Университет')])[2]")
    private WebElement univer;

    @FindBy(xpath = "(//span[contains(text(),'Образование')])[2]")
    private WebElement obraz;

    @FindBy(xpath = "(//span[contains(text(),'Наука')])[2]")
    private WebElement nauka;

    @FindBy(xpath = "(//span[contains(text(),'Развитие')])[2]")
    private WebElement razvit;

    @FindBy(xpath = "(//span[contains(text(),'Сотрудничество')])[2]")
    private WebElement souz;

    @FindBy(xpath = "(//span[contains(text(),'Справочник')])[2]")
    private WebElement spravka;

    // локаторы на заголовки разделов
    @FindBy(xpath = "//h1[contains(text(),'Университет сегодня')]")
    private WebElement universitet;

    @FindBy(xpath = "//h1[contains(text(),'Образование в ВолгГТУ')]")
    private WebElement learn;

    @FindBy(xpath = "//h1[contains(text(),'Наука в ВолгГТУ')]")
    private WebElement science;

    @FindBy(xpath = "//h1[contains(text(),'Вопросы перспективного развития')]")
    private WebElement evolution;

    @FindBy(xpath = "//h1[contains(text(),'Сотрудничество')]")
    private WebElement ourjob;

    @FindBy(xpath = "//h1[contains(text(),'Справочник')]")
    private WebElement findbook;


    public Navigation() {
        driver.get("https://www.vstu.ru/");
        PageFactory.initElements(driver, this);
    }

    public String auth () throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        univer.click();
        TimeUnit.SECONDS.sleep(2);
        obraz.click();
        TimeUnit.SECONDS.sleep(2);
        nauka.click();
        TimeUnit.SECONDS.sleep(2);
        razvit.click();
        TimeUnit.SECONDS.sleep(2);
        souz.click();
        TimeUnit.SECONDS.sleep(2);
        spravka.click();
        TimeUnit.SECONDS.sleep(3);
        return auth();
    }


        public String getTextUniverTitle() {
            return universitet.getText();
        }
        public String getTextObrazTitle() {
            return obraz.getText();
        }
        public String getTextNaukaTitle() {
            return nauka.getText();
        }
        public String getTextRazvitTitle() {
            return razvit.getText();
        }
        public String getTextSouzTitle() {
            return souz.getText();
        }
        public String getTextSpravkaTitle() {
            return spravka.getText();
        }




        //throw new NotFoundException("Не найдена кнопка с таким именем: " + auth());

}
