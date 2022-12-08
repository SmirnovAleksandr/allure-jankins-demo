package com.scooter.popup;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPlaced {

    //локатор  "Заказ оформлен"
    @FindBy(how = How.XPATH,using = ".//div[contains(@class, 'Order_ModalHeader') and text()= 'Заказ оформлен']")
    public SelenideElement orderPlacedText;

    //локатор  кнопки "Посмотреть статус"
    @FindBy(how = How.XPATH,using = ".//button[contains(text(), 'Посмотреть статус')]")
    public SelenideElement viewStatusButton;

    //локатор  текста с номероа заказа
    @FindBy(how = How.XPATH,using = ".//div[contains(@class, 'Order_Text')]")
    public SelenideElement orderText;


    public  boolean isOrderPlaced(){
        boolean isOrderPlaced;
        if (orderPlacedText.isDisplayed() && viewStatusButton.isDisplayed() && orderText.getText().contains("Номер заказа:")){
            isOrderPlaced = true;
        } else isOrderPlaced =  false;
        return isOrderPlaced;
    }
}
