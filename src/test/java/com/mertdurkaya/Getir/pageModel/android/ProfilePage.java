package com.mertdurkaya.Getir.pageModel.android;

import com.mertdurkaya.Getir.pageModel.contracts.IProfilePage;
import com.mertdurkaya.Getir.util.Utility;
import org.openqa.selenium.By;

public class ProfilePage extends Utility implements IProfilePage {

    protected final By btnLogout = By.id("itemLogout");

    @Override
    public void clickLogout() {
        clickElement(btnLogout);
    }
}