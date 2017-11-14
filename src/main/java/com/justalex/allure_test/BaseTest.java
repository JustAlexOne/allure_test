package com.justalex.allure_test;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    static {
        Configuration.baseUrl = "https://www.apple.com";
        Configuration.browser = WebDriverRunner.CHROME;
    }

    @BeforeMethod
    public void beforeMethod() {
        Selenide.open("/");
    }

}
