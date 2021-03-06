package com.simpleims.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://localhost:9000/")
public class LoginAgentPage extends PageObject {

    @FindBy(name="username")
    private  WebElementFacade username;

    @FindBy(name="password")
    private  WebElementFacade password;

    @FindBy(css = "button")
    private  WebElementFacade btn_submit;

    String key_username="jacksmith";
    String key_password="group123";

    public void enter_username() {
        username.type(key_username);
    }

    public void enter_password() {
        password.sendKeys(key_password);
    }

    public void submit_login() {
        btn_submit.click();
    }

    public String get_current_url() {
        return getDriver().getCurrentUrl();
    }
}