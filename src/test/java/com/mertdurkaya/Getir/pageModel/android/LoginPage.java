package com.mertdurkaya.Getir.pageModel.android;

import com.mertdurkaya.Getir.pageModel.contracts.ILoginPage;
import com.mertdurkaya.Getir.util.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility implements ILoginPage {

    protected final By edtUsername = By.id("usernameEditText");
    protected final By edtPassword = By.id("passwordEditText");
    protected final By btnSubmit = By.id("loginButton");

    @Override
    public void checkLoginPageElements() {
        forceWait(5);
        isElementDisplayed(edtUsername);
        isElementDisplayed(edtPassword);
        isElementDisplayed(btnSubmit);
    }

    @Override
    public void setValidUsername() {
        sendKeys(edtUsername, "hello@getir.com");
    }

    @Override
    public void setValidPassword() {
        sendKeys(edtPassword, "hello");
    }

    @Override
    public void clickSubmitButton() {
        clickElement(btnSubmit);
    }

    @Override
    public void setInvalidUsername() {
        sendKeys(edtUsername, "hola@getir.com");
    }

    @Override
    public void setInvalidPassword() {
        sendKeys(edtPassword, "hola");
    }
}