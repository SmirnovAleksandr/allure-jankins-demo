package com.scooter.popup;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;


public class OrderConfirmation {

    //локатор  кнопки "да"
    @FindBy(how = How.XPATH,using = ".//button[text()='Да']")
    private SelenideElement confirmButton;

    public OrderConfirmation confirmOrder(){
        confirmButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        confirmButton.click();
        return this;
    }
}
