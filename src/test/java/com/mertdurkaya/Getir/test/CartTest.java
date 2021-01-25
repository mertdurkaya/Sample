package com.mertdurkaya.Getir.test;

import com.mertdurkaya.Getir.pageModel.android.CartPage;
import com.mertdurkaya.Getir.pageModel.contracts.ICartPage;
import com.mertdurkaya.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartTest extends Utility {
    public ICartPage cartPage = new CartPage();

    @And("Check added items on cart page")
    public void checkAddedItemsOnCartPage() {
        cartPage.checkCartItems();
    }

    @Then("Remove added items on cart page")
    public void removeAddedItemsOnCartPage() {
        cartPage.removeCartItems();
    }

    @And("Check all items are removed from cart")
    public void checkAllItemsAreRemovedFromCart() {
        cartPage.checkAllItemsRemoved();
    }

    @When("Increase items in the cart one by one")
    public void increaseItemsInTheCartOneByOne() {
        cartPage.increaseCartItems();
    }

    @Then("Check after added items on cart page")
    public void checkAfterAddedItemsOnCartPage() {
        cartPage.checkAfterAddedItems();
    }

    @And("Click payment button")
    public void clickPaymentButton() {
        cartPage.clickPayment();
    }
}
