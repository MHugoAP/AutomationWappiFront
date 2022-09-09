package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.PersonaInformation.*;

public class PersonaInformation implements Task {

    @Override
    public <T extends Actor> void performAs(T actorInformation) {
        actorInformation.attemptsTo(Click.on(PERSONAL_INFORMATION));
    }

    public static PersonaInformation updateProfile(){
        return Tasks.instrumented(PersonaInformation.class);
    }
}
