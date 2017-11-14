package com.justalex.allure_test.tests;

import com.justalex.allure_test.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TheTests extends BaseTest {

    @Test
    public void test1() throws Exception {
        $(".hero-position-1 .headline").shouldHave(text("iPhone X"));
    }

}
