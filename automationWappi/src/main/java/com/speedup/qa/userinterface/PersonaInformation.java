package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonaInformation {

    public static final Target PERSONAL_INFORMATION = Target
            .the("Clic on Personal information")
            .located(By.xpath("//a[normalize-space()='Información personal']"));
}
