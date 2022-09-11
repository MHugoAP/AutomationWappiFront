package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.PersonaInformation.*;

public class PlaceOrderVerifyCoupon implements Task {

    @Override
    public <T extends Actor> void performAs(T actorVerifyCoupon) {
        actorVerifyCoupon.attemptsTo(Click.on(MY_ORDERS));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actorVerifyCoupon.attemptsTo(Click.on(VERIFY_COUPON));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actorVerifyCoupon.attemptsTo(Click.on(INICIO));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static PlaceOrderVerifyCoupon placeOrderVerifyCoupon(){
        return Tasks.instrumented(PlaceOrderVerifyCoupon.class);
    }
}
