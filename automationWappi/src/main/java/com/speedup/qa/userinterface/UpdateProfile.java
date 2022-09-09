package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UpdateProfile {

    public static final Target MODIFY_NAME = Target
            .the("Modify name")
            .located(By.xpath("//input[@id='name']"));

    public static final Target MODIFY_LAST_NAME = Target
            .the("Modify last name")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target MODIFY_DAY_OF_BIRTH= Target
            .the("Modify day of birth")
            .located(By.xpath("//input[@id='bornDate']"));

    public static final By MODIFY_COUNTRY = By.xpath("//select[@id='country']");

    public static final By SELECT_PHOTO = By.xpath("//input[@id='image']");

    public static final Target SAVE_PROFILE = Target
            .the("Save profile")
            .located(By.id("save-profile"));
}
