package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class PersonaInformation {

    public static final Target PERSONAL_INFORMATION = Target
            .the("Clic on Personal information")
            .located(By.xpath("//a[normalize-space()='Información personal']"));
//(//*[@class='nav-bar-link'])[2]
    public static final Target VERIFY_COUPON = Target
            .the("Chcek coupon")
            .located(By.xpath("//a[normalize-space()='Cupones']"));

    public static final Target INICIO = Target
            .the("inicio")
            .located(By.xpath("//a[normalize-space()='Inicio']"));

    public static final Target MY_ORDERS = Target
            .the("My orders")
            .located(By.xpath("//a[normalize-space()='Mis pedidos']"));
}
