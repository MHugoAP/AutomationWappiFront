package com.speedup.qa.tasks;

import com.speedup.qa.models.LoginUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterface.Login.*;

public class LoginUserPassword implements Task {

    private LoginUserData loginUserDataInstance;

    public LoginUserPassword(LoginUserData loginUserData){
        this.loginUserDataInstance = loginUserData;
    }

    @Override
    public <T extends Actor> void performAs(T actorLogin) {
        //actorLogin.attemptsTo(Click.on(USERNAME));
        actorLogin.attemptsTo(Enter.theValue(loginUserDataInstance.getUser()).into(USERNAME));
        actorLogin.attemptsTo(Enter.theValue(loginUserDataInstance.getPassword()).into(PASSWORD));
        actorLogin.attemptsTo(Click.on(BUTTON_LOGIN));
    }

    public static LoginUserPassword withTheData(LoginUserData loginUserData){
        return new LoginUserPassword(loginUserData);
    }
}
