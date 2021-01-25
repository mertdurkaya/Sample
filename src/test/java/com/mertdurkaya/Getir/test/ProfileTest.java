package com.mertdurkaya.Getir.test;

import com.mertdurkaya.Getir.pageModel.android.ProfilePage;
import com.mertdurkaya.Getir.pageModel.contracts.IProfilePage;
import com.mertdurkaya.Getir.util.Utility;
import io.cucumber.java.en.Then;

public class ProfileTest extends Utility {

    public IProfilePage profilePage = new ProfilePage();

    @Then("Click logout button")
    public void clickLogoutButton() {
        profilePage.clickLogout();
    }
}
