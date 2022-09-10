package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class PlaceOrderInitiation {

    public static final Target RETURN_INITIATION = Target
            .the("")
            .located(By.xpath("//a[normalize-space()='Inicio']"));

    public static final Target BUTTON_OIL = Target
            .the("Buy oil")
            .located(By.xpath("(//button[@class='button success offers-table-block-button'])[1]"));

    public static final Target BUTTON_BREAD = Target
            .the("Buy bread")
            .located(By.xpath("(//button[@class='button success offers-table-block-button'])[2]"));

    public static final Target BUTTON_HAM = Target
            .the("Buy ham")
            .located(By.xpath("(//button[@class='button success offers-table-block-button'])[3]"));

    public static final Target PASTE_COUPON = Target
            .the("Paste coupon")
            .located(By.xpath("//input[@id='coupon']"));

    public static final By PASTE_COUPON2 = By.xpath("//input[@id='coupon']");

    public static final Target CONFIRM_ORDER = Target
            .the("To confirm order")
            .located(By.xpath("//button[@id='order-confirm']"));

    public static final By CONFIRMATION_WINDOW = By.xpath("//p[@class='confirmation-modal-info']");

    public static final Target CLOSE_CONFIRMATION_WINDOW = Target
            .the("Close confirmation window")
            .located(By.xpath("(//span[@class='close'])[3]"));

    public static final Target CLOSE_WINDOW_UPDATE_DATA = Target
            .the("Close the window with update data")
            .located(By.xpath("(//span[@class='close'])[2]"));
}
