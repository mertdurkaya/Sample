package com.mertdurkaya.Getir.test;

import com.mertdurkaya.Getir.pageModel.android.HomePage;
import com.mertdurkaya.Getir.pageModel.contracts.IHomePage;
import com.mertdurkaya.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomeTest extends Utility {
    public IHomePage homePage = new HomePage();

    @Then("Check home page elements")
    public void checkHomePageElements() {
        homePage.checkHomePageElements();
    }

    @And("Click profile button")
    public void clickProfileButton() {
        homePage.clickProfile();
    }

    @And("Click {string}")
    public void click(String name) {
        homePage.clickCategory(name);
    }
}