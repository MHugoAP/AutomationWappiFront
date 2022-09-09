package com.speedup.qa.tasks;

import com.speedup.qa.models.UpdateDataBirth;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterface.UpdateProfile.MODIFY_DAY_OF_BIRTH;

public class UpdateProfileBirth implements Task {

    private UpdateDataBirth updateDataBirthInstance;

    public UpdateProfileBirth(UpdateDataBirth updateDataBirth){
        this.updateDataBirthInstance = updateDataBirth;
    }

    @Override
    public <T extends Actor> void performAs(T actorBirth) {
        actorBirth.attemptsTo(Enter.theValue(updateDataBirthInstance.getBirth()).into(MODIFY_DAY_OF_BIRTH));
    }

    public static UpdateProfileBirth withTheData(UpdateDataBirth updateDataBirth){
        return new UpdateProfileBirth(updateDataBirth);
    }
}
