package com.speedup.qa.tasks;

import com.speedup.qa.models.UpdateDataSexo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.UpdateProfile.CHECK_BOX_F;
import static com.speedup.qa.userinterface.UpdateProfile.CHECK_BOX_M;

public class UpdateProfileSexo implements Task {

    private UpdateDataSexo updateDataSexoInstance;

    public UpdateProfileSexo(UpdateDataSexo updateDataSexo) {
        this.updateDataSexoInstance = updateDataSexo;
    }

    @Override
    public <T extends Actor> void performAs(T actorSex) {
        String masculino = "Masculino";
        if (masculino.equals(updateDataSexoInstance.getMasculino())) {
            actorSex.attemptsTo(Click.on(CHECK_BOX_M));
        }else {
            actorSex.attemptsTo(Click.on(CHECK_BOX_F));
        }
    }

    public static UpdateProfileSexo withTheDataSex(UpdateDataSexo dataSex) {
        return new UpdateProfileSexo(dataSex);
    }
}
