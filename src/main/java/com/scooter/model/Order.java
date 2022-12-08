package com.scooter.model;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.scooter.popup.OrderConfirmation;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;

public class Order {

    //локатор  поля "Имя"
    @FindBy(how = How.XPATH,using = ".//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder = '* Имя']")
    private SelenideElement nameField;

    //локатор  поля "Фамилия"
    @FindBy(how = How.XPATH,using = ".//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder = '* Фамилия']")
    private SelenideElement surnameField;

    //локатор  поля "Адрес"
    @FindBy(how = How.XPATH,using = ".//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder = '* Адрес: куда привезти заказ']")
    private SelenideElement addressField;

    //локатор  поля "Станция метро"
    @FindBy(how = How.XPATH,using = ".//*[@class='select-search__input']")
    private SelenideElement metroStationField;

    //локатор выпадающего списка метро
    @FindBy(how = How.XPATH,using = ".//*[@class='select-search__select']")
    private ElementsCollection metroStationDropdown;

    //локатор поля "Телефон"
    @FindBy(how = How.XPATH,using = ".//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder = '* Телефон: на него позвонит курьер']")
    private SelenideElement telephoneField;

    //локатор кнопки "Далее"
    @FindBy(how = How.XPATH,using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']")
    private SelenideElement  nextButton;

    //локатор  поля "когда привезти самокат"
    @FindBy(how = How.XPATH,using = ".//input[@placeholder = '* Когда привезти самокат']")
    private SelenideElement whenBringScooterField;

    //локатор  поля "Срок аренды"
    @FindBy(how = How.XPATH,using = ".//div[text()= '* Срок аренды']")
    private SelenideElement rentalPeriodField;

    //локатор  выпадающего списка  "Срок аренды"
    @FindBy(how = How.XPATH,using = ".//div[@class = 'Dropdown-menu']")
    private ElementsCollection rentalPeriodDropdown;

    //локатор  радиобаттонов "Цвет самоката"
    @FindBy(how = How.XPATH,using = ".//div[contains(@class, 'Order_Checkboxes')]//label")
    private ElementsCollection colorScooter;

    //локатор  комментария
    @FindBy(how = How.XPATH,using = ".//input[@placeholder= 'Комментарий для курьера']")
    private SelenideElement commentField;

    //локатор  кнопки "Заказать"
    @FindBy(how = How.XPATH,using = ".//div[contains(@class, 'Order_Buttons')]//button[text()='Заказать']")
    private SelenideElement orderButton;


    public Order fillCustomerForm(String name, String surname, String address, String metroName, String telephone){
        nameField.setValue(name);
        surnameField.setValue(surname);
        addressField.setValue(address);
        selectMetro(metroName);
        telephoneField.setValue(telephone);
        nextButtonClick();
        return this;
    }

    public Order fillRentForm(String date, String rentalPeriod, String color, String comment){
         enterDateWhenBringScooterField(date);
         selectRentalPeriod(rentalPeriod);
         selectColorScooter(color);
         writeComment(comment);
        return this;
    }

    public void nextButtonClick(){
        nextButton.click();
    }

    public void  selectMetro(String name){
        metroStationField.click();
        metroStationDropdown.findBy(Condition.text(name)).click();
    }

    public  Order  enterDateWhenBringScooterField(String date){
        whenBringScooterField.setValue(date);
        whenBringScooterField.pressEnter();
        return this;
    }

    public  Order  writeComment(String comment){
        commentField.setValue(comment);
        return this;
    }

    public OrderConfirmation clickOrderButton(){
        orderButton.click();
        return page(OrderConfirmation.class);
    }

    public Order  selectRentalPeriod(String period){
        rentalPeriodField.click();
        rentalPeriodDropdown.findBy(Condition.text(period)).click();
        return this;
    }
    public Order  selectColorScooter(String color){
        colorScooter.findBy(Condition.text(color)).click();
        return this;
    }
}
