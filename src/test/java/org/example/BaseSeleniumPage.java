package org.example;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

abstract public class BaseSeleniumPage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }


}
