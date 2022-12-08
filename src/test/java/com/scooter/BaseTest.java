package com.scooter;

import com.scooter.pageobjects.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    MainPage mainPage;

    @Before
    public  void startUp(){
        /*
            WebDriverManager.chromedriver().setup();
            Configuration.browser = "chrome";
        */

        WebDriverManager.firefoxdriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "2560x1440";
        mainPage = open(MainPage.url, MainPage.class)
                .closeCookie();
    }
}
