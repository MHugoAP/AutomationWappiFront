package com.speedup.qa.tasks;

import com.speedup.qa.models.UpdateDataName;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterface.UpdateProfile.MODIFY_NAME;

public class UpdateProfileName implements Task {

    private UpdateDataName updateDataNameInstance;

    public UpdateProfileName(UpdateDataName updateDataName){
        this.updateDataNameInstance = updateDataName;
    }
    @Override
    public <T extends Actor> void performAs(T actorUpdate) {
        actorUpdate.attemptsTo(Enter.theValue(updateDataNameInstance.getName()).into(MODIFY_NAME));

    }

    public static UpdateProfileName updateProfile(UpdateDataName updateDataName){
        return new UpdateProfileName(updateDataName);
    }
}
