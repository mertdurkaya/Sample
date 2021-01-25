package com.mertdurkaya.Getir.test;

import com.mertdurkaya.Getir.pageModel.android.PayPage;
import com.mertdurkaya.Getir.pageModel.contracts.IPayPage;
import com.mertdurkaya.Getir.util.Utility;
import io.cucumber.java.en.And;

public class PayTest extends Utility {
    public IPayPage payPage = new PayPage();

    @And("Check payment page elements")
    public void checkPaymentPageElements() {
        payPage.checkPayment();
    }

    @And("Click back")
    public void clickBack() {
        payPage.clickBack();
    }
}
