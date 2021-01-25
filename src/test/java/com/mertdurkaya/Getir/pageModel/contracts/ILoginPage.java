package com.mertdurkaya.Getir.pageModel.contracts;

public interface ILoginPage {
    void checkLoginPageElements();

    void setValidUsername();

    void setValidPassword();

    void clickSubmitButton();

    void setInvalidUsername();

    void setInvalidPassword();
}