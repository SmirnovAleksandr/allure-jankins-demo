package com.scooter;

import com.scooter.pageobjects.MainPage;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.Assert;
import static com.codeborne.selenide.Selenide.open;

public class MainPageFaqTests extends  BaseTest{

    @Test
    @DisplayName("Проверка первого элемента в вопросах")
    public void checkFirstElementInQuestionsAboutImportant(){
        mainPage.moveToQuestionsAboutImportant();
        mainPage.questionItemClick(1);
        var result = mainPage.getTextOfQuestion(1);
        var expectedResult = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals(String.format("Строки не равны," +
                        "ожидается строка - '%s'," +
                        "фактический результат - '%s'", result, expectedResult),
                result, expectedResult);
    }

    @Test
    public void checkSecondElementInQuestionsAboutImportant(){
        mainPage.moveToQuestionsAboutImportant();
        mainPage.questionItemClick(2);
        var result = mainPage.getTextOfQuestion(2);
        var expectedResult = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями," +
                " можете просто сделать несколько заказов — один за другим.";
        Assert.assertEquals(String.format("Строки не равны," +
                                             "ожидается строка - '%s'," +
                "фактический результат - '%s'", result, expectedResult),
                                              result, expectedResult);
    }

    @Test
    public void checkFhirdElementInQuestionsAboutImportant(){
        mainPage.moveToQuestionsAboutImportant();
        mainPage.questionItemClick(3);
        var result = mainPage.getTextOfQuestion(3);
        var expectedResult = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        Assert.assertEquals(String.format("Строки не равны," +
                        "ожидается строка - '%s'," +
                        "фактический результат - '%s'", result, expectedResult),
                result, expectedResult);
    }

    @Test
    public void checkFourhtElementInQuestionsAboutImportant(){
        mainPage.moveToQuestionsAboutImportant();
        mainPage.questionItemClick(4);
        var result = mainPage.getTextOfQuestion(4);
        var expectedResult = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        Assert.assertEquals(String.format("Строки не равны," +
                        "ожидается строка - '%s'," +
                        "фактический результат - '%s'", result, expectedResult),
                result, expectedResult);
    }

    @Test
    public void checkFifthElementInQuestionsAboutImportant(){
        mainPage.moveToQuestionsAboutImportant();
        mainPage.questionItemClick(5);
        var result = mainPage.getTextOfQuestion(5);
        var expectedResult = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        Assert.assertEquals(String.format("Строки не равны," +
                        "ожидается строка - '%s'," +
                        "фактический результат - '%s'", result, expectedResult),
                result, expectedResult);
    }

    @Test
    public void checkSixthElementInQuestionsAboutImportant(){

        MainPage mainPage = open(MainPage.url, MainPage.class);
        mainPage.moveToQuestionsAboutImportant();
        mainPage.questionItemClick(6);
        var result = mainPage.getTextOfQuestion(6);
        var expectedResult = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток" +
                " — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        Assert.assertEquals(String.format("Строки не равны," +
                        "ожидается строка - '%s'," +
                        "фактический результат - '%s'", result, expectedResult),
                result, expectedResult);
    }

    @Test
    public void checkSeventhElementInQuestionsAboutImportant(){

        MainPage mainPage = open(MainPage.url, MainPage.class);
        mainPage.moveToQuestionsAboutImportant();
        mainPage.questionItemClick(7);
        var result = mainPage.getTextOfQuestion(7);
        var expectedResult = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        Assert.assertEquals(String.format("Строки не равны," +
                        "ожидается строка - '%s'," +
                        "фактический результат - '%s'", result, expectedResult),
                result, expectedResult);
    }

    @Test
    public void checkEighthElementInQuestionsAboutImportant(){
        //--s> allure serve -h 127.0.0.1 -p 3030 C:\yandexPraktikum\target\allure-results

        MainPage mainPage = open(MainPage.url, MainPage.class);
        mainPage.moveToQuestionsAboutImportant();
        mainPage.questionItemClick(8);
        var result = mainPage.getTextOfQuestion(8);
        var expectedResult = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        Assert.assertEquals(String.format("Строки не равны," +
                        "ожидается строка - '%s'," +
                        "фактический результат - '%s'", result, expectedResult),
                result, expectedResult);
    }

}
