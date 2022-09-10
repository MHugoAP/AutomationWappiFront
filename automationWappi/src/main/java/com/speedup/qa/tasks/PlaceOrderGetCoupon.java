package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.speedup.qa.userinterface.PlaceOrder.*;

public class PlaceOrderGetCoupon implements Task {
    @Managed
    private WebDriver myBrowser;


    @Override
    public <T extends Actor> void performAs(T actionGetCoupon) {
        actionGetCoupon.attemptsTo(Click.on(GET_COUPON));
        actionGetCoupon.attemptsTo(Click.on(CLOSE_WINDOW));
    }

    public static PlaceOrderGetCoupon placeOrdertGetCoupon() {
        return Tasks.instrumented(PlaceOrderGetCoupon.class);
    }
}
