package com.speedup.qa.tasks;

import com.speedup.qa.questions.PlaceOrderCopyCoupon;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static com.speedup.qa.userinterface.PlaceOrder.CLOSE_WINDOW;
import static com.speedup.qa.userinterface.PlaceOrder.COPY_COUPON;
import static com.speedup.qa.userinterface.PlaceOrderInitiation.*;

public class PlaceOrderBuyCoupon implements Task {
    @Managed
    private WebDriver myBrowser;
    @Override
    public <T extends Actor> void performAs(T actorBuyCoupon) {
        actorBuyCoupon.attemptsTo(Click.on(RETURN_INITIATION));
        actorBuyCoupon.attemptsTo(Click.on(BUTTON_BREAD));
        actorBuyCoupon.attemptsTo(Click.on(PASTE_COUPON));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actorBuyCoupon.attemptsTo(Click.on(CONFIRM_ORDER));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actorBuyCoupon.attemptsTo(Click.on(CLOSE_CONFIRMATION_WINDOW));
    }

    public static PlaceOrderBuyCoupon placeOrdertBuyCoupon() {
        return Tasks.instrumented(PlaceOrderBuyCoupon.class);
    }
}
