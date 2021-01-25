package com.mertdurkaya.Getir.pageModel.android;

import com.mertdurkaya.Getir.pageModel.contracts.ICategoryDetailPage;
import com.mertdurkaya.Getir.util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class CategoryDetailPage extends Utility implements ICategoryDetailPage {

    protected final By btnAddProduct = By.id("btnAdd");
    protected final By btnBack = By.id("ga_toolbar_leftIconImageView");
    protected final By btnCart = By.id("ga_toolbar_getir10GABasketButton");
    private static Random random = new Random();

    @Override
    public void clickAdd() {
        waitElementVisibility(btnAddProduct);
        List<WebElement> productlist = findElements(btnAddProduct);
        int randomProductNumber = random.nextInt(productlist.size());
        clickElement(productlist.get(randomProductNumber));
    }

    @Override
    public void clickCart() {
        clickElement(btnCart);
    }

    @Override
    public void clickBack() {
        clickElement(btnBack);
        forceWait(3);
    }
}
