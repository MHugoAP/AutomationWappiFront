package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static com.speedup.qa.userinterface.PlaceOrder.COPY_COUPON;

public class PlaceOrderCopyCoupon implements Question<String> {

    @Override
    public String answeredBy(Actor actorCopy) {
        return BrowseTheWeb.as(actorCopy).find(COPY_COUPON).getText();
    }

    public static PlaceOrderCopyCoupon messageCopy(){
        return new PlaceOrderCopyCoupon();
    }
}
