package com.mertdurkaya.Getir.pageModel.android;

import com.mertdurkaya.Getir.pageModel.contracts.IHomePage;
import com.mertdurkaya.Getir.util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HomePage extends Utility implements IHomePage {
    protected final By categoryItem = By.className("android.widget.TextView");
    protected final By btnProfile = By.id("ga_toolbar_leftIconImageView");
    protected final By btnCart = By.id("ga_toolbar_getir10GABasketButton");

    private Random random = new Random();
    private Map<String, Integer> categoryName = new HashMap<>();

    public HomePage() {
        categoryName.put("Meyve ve Sebze", 0);
        categoryName.put("Atıştırmalık", 1);
        categoryName.put("Dondurma", 2);
        categoryName.put("Yiyecek", 3);
        categoryName.put("İçecek", 4);
        categoryName.put("Fit & Form", 5);
        categoryName.put("Süt & Kahvaltı", 6);
        categoryName.put("Temel Gıda", 7);
        categoryName.put("Kişisel Bakım", 8);
        categoryName.put("Ev & Yaşam", 9);
        categoryName.put("Ev Bakım", 10);
        categoryName.put("Teknoloji", 11);
        categoryName.put("Bebek", 12);
    }

    @Override
    public void checkHomePageElements() {
        isElementDisplayed(btnProfile);
        isElementDisplayed(btnCart);
        isElementDisplayed(categoryItem);
    }

    @Override
    public void clickProfile() {
        clickElement(btnProfile);
    }

    @Override
    public void clickCategory(String name) {
        int productIndex = categoryName.get(name);

        if (productIndex<10) {
            WebElement product = findElements(categoryItem).get(productIndex);
            clickElement(product);
        } else {
            swipe(driver, Direction.DOWN, Duration.ofMillis(3000));
            WebElement product = findElements(categoryItem).get(productIndex);
            clickElement(product);
        }
    }
}