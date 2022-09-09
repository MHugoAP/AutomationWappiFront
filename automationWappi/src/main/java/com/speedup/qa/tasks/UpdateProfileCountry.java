package com.speedup.qa.tasks;

import com.speedup.qa.models.UpdateDataCountry;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static com.speedup.qa.userinterface.Login.BUTTON_LOGIN;
import static com.speedup.qa.userinterface.UpdateProfile.MODIFY_COUNTRY;
import static com.speedup.qa.userinterface.UpdateProfile.MODIFY_LAST_NAME;

public class UpdateProfileCountry implements Task {

    @Managed
    private WebDriver myBrowser;

    private UpdateDataCountry updateDataCountryInstance;

    public UpdateProfileCountry(UpdateDataCountry updateDataCountry){
        this.updateDataCountryInstance = updateDataCountry;
    }

    @Override
    public <T extends Actor> void performAs(T actorCountry) {

        Select menu1 = new Select(myBrowser.findElement(MODIFY_COUNTRY));
        String arg ="Argentina";
        String col="Colombia";
        String eua="Estados Unidos";
        if (arg.equals(updateDataCountryInstance.getCountry())) {
            menu1.selectByIndex(1);
        }else if (col.equals(updateDataCountryInstance.getCountry())){
            menu1.selectByIndex(2);
        } else if (eua.equals(updateDataCountryInstance.getCountry())){
            menu1.selectByIndex(3);
        }
    }

    public static UpdateProfileCountry withTheDataCountry(UpdateDataCountry country){
        return new UpdateProfileCountry(country);
    }
}
