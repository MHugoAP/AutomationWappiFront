package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.PlaceOrderInitiation.CLOSE_CONFIRMATION_WINDOW;

public class Close implements Task {
    @Override
    public <T extends Actor> void performAs(T actorClose) {
        actorClose.attemptsTo(Click.on(CLOSE_CONFIRMATION_WINDOW));
    }
    public static Close close(){
        return new Close();
    }
}
