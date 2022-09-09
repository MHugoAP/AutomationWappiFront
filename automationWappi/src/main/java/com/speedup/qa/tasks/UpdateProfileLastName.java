package com.speedup.qa.tasks;

import com.speedup.qa.models.UpdateDataLastName;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterface.UpdateProfile.MODIFY_LAST_NAME;

public class UpdateProfileLastName implements Task {

    private UpdateDataLastName updateDataLastNameInstance;

    public UpdateProfileLastName(UpdateDataLastName updateDataLastName){
        this.updateDataLastNameInstance = updateDataLastName;
    }

    @Override
    public <T extends Actor> void performAs(T actorUpdate) {
        actorUpdate.attemptsTo(Enter.theValue(updateDataLastNameInstance.getLastName()).into(MODIFY_LAST_NAME));
    }

    public static UpdateProfileLastName updateProfileLastName(UpdateDataLastName updateDataLastName){
        return new UpdateProfileLastName(updateDataLastName);
    }
}
