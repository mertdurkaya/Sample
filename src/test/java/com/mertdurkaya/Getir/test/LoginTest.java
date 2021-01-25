package com.mertdurkaya.Getir.test;

import com.mertdurkaya.Getir.pageModel.android.LoginPage;
import com.mertdurkaya.Getir.pageModel.contracts.ILoginPage;
import com.mertdurkaya.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginTest extends Utility {

    public ILoginPage loginPage = new LoginPage();

    @Given("Check login page elements")
    public void checkLoginPageElements() {
        loginPage.checkLoginPageElements();
    }

    @Given("Send valid username to username field")
    public void sendValidUsernameToUsernameField() {
        loginPage.setValidUsername();
    }

    @When("Send valid password to password field")
    public void sendValidPasswordToPasswordField() {
        loginPage.setValidPassword();
    }

    @And("Click submit button")
    public void clickSubmitButton() {
        loginPage.clickSubmitButton();
    }

    @Given("Send invalid username to username field")
    public void sendInvalidUsernameToUsernameField() {
        loginPage.setInvalidUsername();
    }

    @When("Send invalid password to password field")
    public void sendInvalidPasswordToPasswordField() {
        loginPage.setInvalidPassword();
    }
}