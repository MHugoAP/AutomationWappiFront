package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static com.speedup.qa.userinterface.UpdateProfile.SELECT_PHOTO;

public class UpdateProfilePhoto implements Task {

    @Managed
    private WebDriver myBrowser;

    @Override
    public <T extends Actor> void performAs(T actorPhoto) {
        File file= new File("C:\\Users\\drago\\OneDrive\\Escritorio\\unknown.png");
        String path= file.getAbsolutePath();
        myBrowser.findElement(SELECT_PHOTO).sendKeys("C:\\Users\\drago\\OneDrive\\Escritorio\\unknown.png");
    }
    public static UpdateProfilePhoto profilePhoto(){
        return Tasks.instrumented(UpdateProfilePhoto.class);
    }
}
