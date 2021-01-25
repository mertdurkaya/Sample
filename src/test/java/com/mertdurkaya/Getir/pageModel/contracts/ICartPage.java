package com.mertdurkaya.Getir.pageModel.contracts;

public interface ICartPage {
    void checkCartItems();

    void removeCartItems();

    void checkAllItemsRemoved();

    void increaseCartItems();

    void checkAfterAddedItems();

    void clickPayment();
}
