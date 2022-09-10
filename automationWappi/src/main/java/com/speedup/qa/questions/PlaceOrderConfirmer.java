package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.speedup.qa.userinterface.PlaceOrderInitiation.CONFIRMATION_WINDOW;

public class PlaceOrderConfirmer implements Question<String> {
    @Override
    public String answeredBy(Actor actorConfirm) {
        return BrowseTheWeb.as(actorConfirm).find(CONFIRMATION_WINDOW).getText();
    }
    public static PlaceOrderConfirmer placeOrderConfirmer(){
        return new PlaceOrderConfirmer();
    }
}
