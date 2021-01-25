package com.mertdurkaya.Getir.pageModel.android;

import com.mertdurkaya.Getir.pageModel.contracts.ICartPage;
import com.mertdurkaya.Getir.util.Utility;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

public class CartPage extends Utility implements ICartPage {

    protected final By txtItemCount = By.id("tvCount");
    protected final By txtItemPrice = By.id("tvPrice");
    protected final By btnRemove = By.id("btnRemove");
    protected final By txtAmount = By.id("tvTotalTitle");
    protected final By txtResult = By.id("tvTitle");
    protected final By btnPayment = By.id("btnCheckout");

    @Override
    public void checkCartItems() {
        swipe(driver, Direction.DOWN, Duration.ofMillis(3000));
        forceWait(3);
        List<WebElement> productCountList = findElements(txtItemCount);

        for (WebElement webElement : productCountList) {
            Assert.assertEquals("Added item is not in cart !", "1", webElement.getText());
        }

        int sum =0;
        List<WebElement> itemPriceList = findElements(txtItemPrice);
        for (int i = 0; i < productCountList.size(); i++) {
            int a = Integer.parseInt(itemPriceList.get(i).getText().replaceAll("\\D+",""));
            int b = Integer.parseInt(productCountList.get(i).getText().replaceAll("\\D+",""));
            int c = a*b;
            sum = sum + c;
        }
        Assert.assertEquals("Items total price is not true !", Integer.parseInt(getText(txtAmount).replaceAll("\\D+","")), sum);
    }

    @Override
    public void removeCartItems() {
        int count = Integer.parseInt(getText(txtItemCount));
        for (int j = 3; j > 0; j--) {
            for (int i = 0; i < count; i++) {
                if (isElementVisible(btnRemove)) {
                    clickElement(btnRemove);
                } else {
                    break;
                }
            }
        }
        }

    @Override
    public void checkAllItemsRemoved() {
        Assert.assertEquals("Items are not removed!", "There is no result", getText(txtResult));
    }

    @Override
    public void increaseCartItems() {
        List<AndroidElement> addButtons = driver.findElements(By.id("btnAdd"));
        swipe(driver, Direction.DOWN, Duration.ofMillis(2000));
        for (AndroidElement addButton : addButtons) {
            clickElement(addButton);
            forceWait(2);
        }
    }

    @Override
    public void checkAfterAddedItems() {
        swipe(driver, Direction.DOWN, Duration.ofMillis(3000));
        forceWait(3);
        List<AndroidElement> imgViews = driver.findElements(By.id("tvCount"));
        Assert.assertEquals("Items are not in cart !", 3, imgViews.size());

        List<WebElement> productCountList = findElements(txtItemCount);
        List<WebElement> itemPriceList = findElements(txtItemPrice);

        int sum =0;
        for (int i = 0; i < productCountList.size(); i++) {
            int a = Integer.parseInt(itemPriceList.get(i).getText().replaceAll("\\D+",""));
            int b = Integer.parseInt(productCountList.get(i).getText().replaceAll("\\D+",""));
            int c = a*b;
            sum = sum + c;
        }
        Assert.assertEquals("Items total price is not true !", Integer.parseInt(getText(txtAmount).replaceAll("\\D+","")), sum);
    }

    @Override
    public void clickPayment() {
        clickElement(btnPayment);
    }
}