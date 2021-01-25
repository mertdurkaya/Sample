package com.mertdurkaya.Getir.test;

import com.mertdurkaya.Getir.pageModel.android.CategoryDetailPage;
import com.mertdurkaya.Getir.pageModel.contracts.ICategoryDetailPage;
import com.mertdurkaya.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CategoryDetailTest extends Utility {
    public ICategoryDetailPage categoryDetailPage = new CategoryDetailPage();

    @Then("Click add on random item")
    public void clickAddOnRandomItem() {
        categoryDetailPage.clickAdd();
    }

    @Then("Click cart button")
    public void clickCartButton() {
        categoryDetailPage.clickCart();
    }


    @And("Click back button on category")
    public void clickBackButtonOnCategory() {
        categoryDetailPage.clickBack();
    }
}
