package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import sun.security.pkcs11.wrapper.CK_LOCKMUTEX;

import static com.speedup.qa.userinterface.PersonaInformation.INICIO;
import static com.speedup.qa.userinterface.PersonaInformation.MY_ORDERS;
import static com.speedup.qa.userinterface.PlaceOrderInitiation.*;

public class PlaceOrderWithoutCoupon implements Task {

    @Override
    public <T extends Actor> void performAs(T actorWithoutCoupon) {
        actorWithoutCoupon.attemptsTo(Click.on(BUTTON_OIL));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actorWithoutCoupon.attemptsTo(Click.on(CONFIRM_ORDER));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actorWithoutCoupon.attemptsTo(Click.on(CLOSE_CONFIRMATION_WINDOW));
        actorWithoutCoupon.attemptsTo(Click.on(MY_ORDERS));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actorWithoutCoupon.attemptsTo(Click.on(INICIO));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actorWithoutCoupon.attemptsTo(Click.on(BUTTON_HAM));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actorWithoutCoupon.attemptsTo(Click.on(CONFIRM_ORDER));
        //actorWithoutCoupon.attemptsTo(Click.on(CLOSE_CONFIRMATION_WINDOW));
    }

    public static PlaceOrderWithoutCoupon placeOrderWithoutCoupon() {
        return Tasks.instrumented(PlaceOrderWithoutCoupon.class);
    }
}
