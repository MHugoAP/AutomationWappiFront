package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlaceOrder {

    public static final Target GET_COUPON = Target
            .the("Get coupon")
            .located(By.id("welcome-coupon"));

    public static final By COPY_COUPON = By.xpath("//tbody/tr/td[1]");

    public static final By COUPY_COUPON_VERSION2 = By.xpath("//div[@id='coupon-modal']//div[@class='modal-content']");

    public static final Target CLOSE_WINDOW = Target
            .the("Close the window")
            .located(By.xpath("//div[@id='coupon-modal']//span[@class='close'][normalize-space()='×']"));

}
//"//span[@id='coupon-code']"
