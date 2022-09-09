package com.speedup.qa.stepdefinition;

import com.speedup.qa.models.*;
import com.speedup.qa.questions.UpdateProfileSaveButtonQ;
import com.speedup.qa.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.speedup.qa.userinterface.UpdateProfile.MODIFY_COUNTRY;
import static com.speedup.qa.userinterface.UpdateProfile.SELECT_PHOTO;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class updateProfileStepDefinition {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void serUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Miguel Hugo");
    }

    @Given("^enter the wappe official page$")
    public void enterTheWappeOfficialPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @And("^login with username and password$")
    public void loginWithUsernameAndPassword(List<LoginUserData> data) {
        int number = (int) (Math.random()*3+1);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUserPassword.withTheData(data.get(number)));
    }

    @When("^we click the personal information button$")
    public void weClickThePersonalInformationButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(PersonaInformation.updateProfile());
    }

    @And("^change the '\"([^\"]*)\"', '\"([^\"]*)\"', '\"([^\"]*)\"', '\"([^\"]*)\"', \"([^\"]*)\"$")
    public void changeThe(UpdateDataName firstName, UpdateDataLastName lastName, UpdateDataBirth birth, UpdateDataCountry country, UpdateDataSexo sex) {
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateProfileName.updateProfile(firstName));
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateProfileLastName.updateProfileLastName(lastName));
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateProfileBirth.withTheData(birth));
        Select menu1 = new Select(myBrowser.findElement(MODIFY_COUNTRY));
        String arg ="Argentina";
        String col="Colombia";
        String eua="Estados Unidos";
        if (arg.equals(country.getCountry())) {
            menu1.selectByIndex(1);
        }else if (col.equals(country.getCountry())){
            menu1.selectByIndex(2);
        } else if (eua.equals(country.getCountry())){
            menu1.selectByIndex(3);
        }
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateProfileSexo.withTheDataSex(sex));
        myBrowser.findElement(SELECT_PHOTO).sendKeys("C:\\Users\\drago\\OneDrive\\Escritorio\\unknown.png");
    }

    @Then("^we save the changes (.*)$")
    public void weSaveTheChanges(String save) {
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateProfileSave.updateProfileSave());
        if (save == save) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(UpdateProfileSaveButtonQ.messageSaveButton(), org.hamcrest.Matchers.is(save)));
            System.out.println("The information was saved correctly");
        }
    }
}
