package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.speedup.qa.userinterface.UpdateProfile.VALIDATE_SAVE_PROFILE;

public class UpdateProfileSaveButtonQ implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((VALIDATE_SAVE_PROFILE), WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_SAVE_PROFILE).viewedBy(actor).asString();
    }
    public static UpdateProfileSaveButtonQ messageSaveButton(){
        return new UpdateProfileSaveButtonQ();
    }
}
