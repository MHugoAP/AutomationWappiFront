package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.PlaceOrderInitiation.CLOSE_WINDOW_UPDATE_DATA;

public class BackToTop implements Task {
    @Override
    public <T extends Actor> void performAs(T actorBackTop) {
        actorBackTop.attemptsTo(Click.on(CLOSE_WINDOW_UPDATE_DATA));
    }
    public static BackToTop backToTop(){
        return Tasks.instrumented(BackToTop.class);
    }
}
