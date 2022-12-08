package com.scooter;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

import com.scooter.popup.OrderPlaced;
import org.junit.Test;


public class MakeOrderTests extends  BaseTest{

    @Test
    public void OrderTestSecond(){
        mainPage.clickOrderButtonInHeader()
                .fillCustomerForm("Василий", "Пупкин", "Восстания 5", "Сокольники", "79110985655")
                .fillRentForm("28.04.2022","трое суток", "серая безысходность", "звоните на тел. звонок не работает")
                .clickOrderButton()
                .confirmOrder()
        ;
        OrderPlaced orderPlaced = page(OrderPlaced.class);
        assertTrue(orderPlaced.isOrderPlaced());
    }

    @Test
    public void OrderTestThird(){
        mainPage.clickOrderButtonInBody()
                .fillCustomerForm("Петр", "Петров", "Бухарстская 10",  "Черкизовская", "79600985644" )
                .fillRentForm("22.01.2022","сутки", "чёрный жемчуг", "просьба оставить у двери")
                .clickOrderButton()
                .confirmOrder()
        ;
        OrderPlaced orderPlaced = page(OrderPlaced.class);
        assertTrue(orderPlaced.isOrderPlaced());
    }


    //





}
