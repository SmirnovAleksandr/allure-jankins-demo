package com.scooter.pageobjects;

import com.codeborne.selenide.SelenideElement;
import com.scooter.model.Order;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public static final String url = "https://qa-scooter.praktikum-services.ru/";

    // Картинка "Самокат"
    @FindBy( how = How.XPATH, using = ".//div[@class='Home_Scooter__3YdJy']/img")
    public SelenideElement scooterImg;

    // Новый текст после скролла "Он лёгкий и с мощными колёсами"
    @FindBy( how = How.XPATH, using = ".//div[@class='Home_Header__iJKdX']/div[@class='Home_SubHeader__zwi_E'][2]")
    public SelenideElement newTextAfterScroll;

    // Блок с характеристиками (Модель Toxic PRO, Максимальная скорость, Проедет без подзарядки, Выдерживает вес)
    @FindBy( how = How.CLASS_NAME, using = "Home_Table__2kPxP")
    public SelenideElement сharacteristicsBlock;

    // Блок для "Как это работает" (Элементы "Кружок с цифрой 1 внутри", Шаг 1 "Заказываете самокат", Описание Шага 1 "Выбираете, когда и куда привезти". -- для каждого шага)
    @FindBy( how = How.CLASS_NAME, using = "Home_RoadMap__2tal_")
    public SelenideElement howItWorksBlock;

    // Шаг1. "Кружок с цифрой 1 внутри"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_RoadMap__2tal_']/div[1]/div[@class = 'Home_StatusCircle__3_aTp']")
    public SelenideElement circleWithNumberOneItem;

    // Шаг 1. "Заказываете самокат"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_StatusBrick__1PsW9'][1]//div[@class='Home_Status__YkfmH']")
    public SelenideElement orderedScooredText;

    // Шаг 1. "Выбираете, когда и куда привезти"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_StatusBrick__1PsW9'][1]//div[@class='Home_StatusDescription__3WGl5']")
    public SelenideElement whenAdnShereBringText;

    // Шаг 2. "Кружок с цифрой 2 внутри"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_RoadMap__2tal_']/div[2]/div[@class = 'Home_StatusCircle__3_aTp']")
    public SelenideElement circleWithNumberTwoItem;

    // Шаг 2. "Курьер привозит самокат"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_StatusBrick__1PsW9'][2]//div[@class='Home_Status__YkfmH']")
    public SelenideElement courierBringsScooterText;

    // Шаг 2. "А вы — оплачиваете аренду"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_StatusBrick__1PsW9'][2]//div[@class='Home_StatusDescription__3WGl5']")
    public SelenideElement andYouPayRentText;

    // Шаг 3. "Кружок с цифрой 3 внутри"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_RoadMap__2tal_']/div[3]/div[@class = 'Home_StatusCircle__3_aTp']")
    public SelenideElement circleWithNumberThreeItem;

    // Шаг 3. "Катаетесь"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_StatusBrick__1PsW9'][3]//div[@class='Home_Status__YkfmH']")
    public SelenideElement riddingText;

    // Шаг 3. "Сколько часов аренды осталось — видно на сайте"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_StatusBrick__1PsW9'][3]//div[@class='Home_StatusDescription__3WGl5']")
    public SelenideElement HowManyHoursRentLeftText;

    // Шаг 4. "Кружок с цифрой 4 внутри"
    @FindBy( how = How.CLASS_NAME, using = "Home_StatusCircle__3_aTp Home_Lineless__2-Rxp")
    public SelenideElement circleWithNumberFourItem;

    // Шаг 4. "Курьер забирает самокат"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_StatusBrick__1PsW9'][4]//div[@class='Home_Status__YkfmH']")
    public SelenideElement courierPickUpScooterText;

    // Шаг 4. "Когда аренда заканчивается"
    @FindBy( how = How.XPATH, using = ".//div[@class = 'Home_StatusBrick__1PsW9'][4]//div[@class='Home_StatusDescription__3WGl5']")
    public SelenideElement whenTheLeaseAndsText;

    //локатор "Вопросы о важном"
    @FindBy(how = How.XPATH,using = ".//div[text()='Вопросы о важном']")
    private SelenideElement  questionsAboutImportantText;

    // Сколько это стоит? И как оплатить?
    @FindBy(how = How.ID, using = "accordion__heading-0")
    public SelenideElement howItCostText;

    // Ответ первого вопроса FAQ
    @FindBy(how = How.ID, using = "accordion__panel-0")
    public SelenideElement howItCostAnswer;

    // Хочу сразу несколько самокатов! Так можно?
    @FindBy(how = How.ID, using = "accordion__heading-1")
    public SelenideElement iWantSeveralScootersText;

    // Ответ второго вопроса FAQ
    @FindBy(how = How.ID, using = "accordion__panel-1")
    public SelenideElement iWantSeveralScootersAnswer;

    // Как рассчитывается время аренды?
    @FindBy(how = How.ID, using = "accordion__heading-2")
    public SelenideElement rentalTimeCalculatedText;

    // Ответ третьего вопроса FAQ
    @FindBy(how = How.ID, using = "accordion__panel-2")
    public SelenideElement rentalTimeCalculatedAnswer;

    // Можно ли заказать самокат прямо на сегодня?
    @FindBy(how = How.ID, using = "accordion__heading-3")
    public SelenideElement orderScooterTodayText;

    // Ответ четвертого вопроса FAQ
    @FindBy(how = How.ID, using = "accordion__panel-3")
    public SelenideElement orderScooterTodayAnswer;

    // Можно ли продлить заказ или вернуть самокат раньше?
    @FindBy(how = How.ID, using = "accordion__heading-4")
    public SelenideElement isPossibleExtendOrderText;

    // Ответ пятого вопроса FAQ
    @FindBy(how = How.ID, using = "accordion__panel-4")
    public SelenideElement isPossibleExtendOrderAnswer;

    // Вы привозите зарядку вместе с самокатом?
    @FindBy(how = How.ID, using = "accordion__heading-5")
    public SelenideElement bringChargingAlontWithScooterText;

    // Ответ шестого вопроса FAQ
    @FindBy(how = How.ID, using = "accordion__panel-5")
    public SelenideElement bringChargingAlontWithScooterAnswer;

    // Можно ли отменить заказ?
    @FindBy(how = How.ID, using = "accordion__heading-6")
    public SelenideElement isPossibleCencelOrderText;

    // Ответ седьмого вопроса FAQ
    @FindBy(how = How.ID, using = "accordion__panel-6")
    public SelenideElement IsPossibleCencelOrderAnswer;

    // Я живу за МКАДом, привезёте?
    @FindBy(how = How.ID, using = "accordion__heading-7")
    public SelenideElement iLiveBegindMKADText;

    // Ответ восьмого вопроса FAQ
    @FindBy(how = How.ID, using = "accordion__panel-7")
    public SelenideElement iLiveBegindMKADAnswer;

    // Лого яндекса
    @FindBy( how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    public SelenideElement headerYandexLogo;

    // Лого самоката
    @FindBy( how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    public SelenideElement headerScooterLogo;

    // Кнопка заказать на хедере
    @FindBy(how = How.XPATH,using = ".//div[@class='Header_Nav__AGCXC']//button[text()='Заказать']")
    private SelenideElement orderInHeaderButton;

    // Кнопка проверки статуса на хедере
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    public SelenideElement headerStatusBtn;

    // Кнопка принятия куки
    @FindBy(how = How.ID, using = "rcc-confirm-button")
    public SelenideElement cookieBtn;

    // Кнопка заказать из тела
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_FinishButton__1_cWm']//button")
    public SelenideElement bodyOrderBtn;

    //закрытие куки
    public  MainPage closeCookie(){
        if(cookieBtn.isDisplayed()){
            cookieBtn.click();
        }
        return  page(this);
    }

    //переход к списку вопросов блока "Вопросы о важном"
    @Step("переход к списку вопросов блока \"Вопросы о важном\"")
    public void moveToQuestionsAboutImportant() {
        questionsAboutImportantText.scrollIntoView(true);
    }

    //кликнуть по кнопке "Заказать" в хедере
    public Order clickOrderButtonInHeader(){
        orderInHeaderButton.click();
        return  page(Order.class);
    }

    //кликнуть по кнопке "Заказать" в хедере
    public Order clickOrderButtonInBody(){
        bodyOrderBtn.scrollTo();
        bodyOrderBtn.click();
        return  page(Order.class);
    }
    @Step("кликнуть по  элементу блока \"Вопросы о важном\"")
    //кликнуть по  элементу блока "Вопросы о важном"
    public void questionItemClick(int questionItem) {
        String locatorTemplate =  "accordion__heading-%s";
        String locator = String.format(locatorTemplate, questionItem - 1);
        SelenideElement itemQuestion = $(byId(locator));
        itemQuestion.click();
    }

    //получить текст вопроса по индексу вопроса
    public  String getTextOfQuestion(int questionItem){
        String locatorTemplate =  "accordion__panel-%s";
        String locator = String.format(locatorTemplate, questionItem - 1);
        SelenideElement itemQuestionResponse = $(byId(locator));
        return itemQuestionResponse.getText();
    }
}
