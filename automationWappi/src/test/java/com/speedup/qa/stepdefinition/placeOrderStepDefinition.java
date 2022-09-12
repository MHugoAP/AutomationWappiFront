package com.speedup.qa.stepdefinition;

import com.speedup.qa.questions.PlaceOrderConfirmer;
import com.speedup.qa.questions.PlaceOrderCopyCoupon;
import com.speedup.qa.tasks.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class placeOrderStepDefinition {
    @Managed
    private WebDriver myBrowser;

    @Given("^I want to place an order with the discount coupon$")
    public void iWantToPlaceAnOrderWithTheDiscountCoupon(){
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrderGetCoupon.placeOrdertGetCoupon());
        System.out.println("Your coupon is: " + PlaceOrderCopyCoupon.messageCopy().answeredBy(theActorInTheSpotlight()));
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrderBuyCoupon.placeOrdertBuyCoupon());
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrderVerifyCoupon.placeOrderVerifyCoupon());
    }

    @And("^place another order without the coupon$")
    public void placeAnotherOrderWithoutTheCoupon() {
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrderWithoutCoupon.placeOrderWithoutCoupon());
    }

    @Then("^you can finish with the purchase (.*)$")
    public void youCanFinishWithThePurchase(String confirm) throws InterruptedException {
        if (confirm == confirm) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PlaceOrderConfirmer.placeOrderConfirmer(), org.hamcrest.Matchers.is(confirm)));
           // System.out.println("Confirmation accepted and processing to finish");
        }
        Thread.sleep(3000);
        OnStage.theActorInTheSpotlight().attemptsTo(Close.close());
        //System.out.println("Completed order");
    }
}
