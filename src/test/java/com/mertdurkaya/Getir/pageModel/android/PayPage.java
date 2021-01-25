package com.mertdurkaya.Getir.pageModel.android;

import com.mertdurkaya.Getir.pageModel.contracts.IPayPage;
import com.mertdurkaya.Getir.util.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PayPage extends Utility implements IPayPage {

    protected final By btnBack = By.id("ga_toolbar_leftIconImageView");
    protected final By txtAmountTitle = By.id("tvAmountTitle");
    protected final By txtAmount = By.id("tvAmount");
    protected final By txtAddressTitle = By.id("tvAddressTitle");
    protected final By txtAddress = By.id("tvAddress");
    protected final By txtPaymentMethodTitle = By.id("tvPaymentMethodTitle");
    protected final By txtPaymentMethod = By.id("tvPaymentMethod");
    protected final By btnOrderNow = By.id("btnCheckout");

    @Override
    public void checkPayment() {
        Assert.assertEquals("Amount title is not shown !","Amount", getText(txtAmountTitle));
        Assert.assertTrue("Amount is not shown !",getText(txtAmount).contains("₺"));
        Assert.assertEquals("Address title is not shown !","Address", getText(txtAddressTitle));
        Assert.assertEquals("Current Address is not shown !","Current Address", getText(txtAddress));
        Assert.assertEquals("Payment Method title is not shown !","Payment Method", getText(txtPaymentMethodTitle));
        Assert.assertEquals("Payment Method is not shown !","Current Payment Method", getText(txtPaymentMethod));
        Assert.assertTrue("Order Now button is not shown !", isElementDisplayed(btnOrderNow));
    }

    @Override
    public void clickBack() {
        clickElement(btnBack);
    }
}
