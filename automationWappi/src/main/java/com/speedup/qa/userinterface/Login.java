package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target USERNAME = Target
            .the("Username")
            .located(By.xpath("//input[@id='username']"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(By.xpath("//input[@id='password']"));

    public static final Target BUTTON_LOGIN = Target
            .the("press enter button")
            .located(By.id("button-login"));
}
