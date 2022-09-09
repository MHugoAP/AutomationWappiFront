package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.UpdateProfile.SAVE_PROFILE;

public class UpdateProfileSave implements Task {
    @Override
    public <T extends Actor> void performAs(T actorSave) {
        actorSave.attemptsTo(Click.on(SAVE_PROFILE));
    }

    public static UpdateProfileSave updateProfileSave(){
        return Tasks.instrumented(UpdateProfileSave.class);
    }
}


