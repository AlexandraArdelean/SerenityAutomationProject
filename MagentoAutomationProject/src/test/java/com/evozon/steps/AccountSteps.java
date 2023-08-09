package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class AccountSteps extends BaseSteps{

    @Step
    public void addToWishlist(String productName){
        accountPage.writeTextInSearchBar(productName);
        accountPage.clickOnSearch();
        productsListPage.clickAddToWishlistBtn(productName);
    }
}