package com.evozon.steps;


import net.thucydides.core.annotations.Step;


public class AccountSteps extends BaseSteps {
    @Step
    public void goToMyAccount() {
        homePage.clickAccountLink();
        homePage.clickMyAccountLink();
    }

    @Step
    public void clickAccountInformation() {
        accountLinksPage.clickAccountInformationLink();
    }

    @Step
    public void clickNewsletterSubscriptions() {
        accountLinksPage.clickNewsletterInformationLink();
    }

    @Step
    public void addToWishlist(String productName) {
        homePage.setSearchText(productName);
        homePage.clickOnSearchIcon();
        productsListPage.clickAddToWishlistBtn(productName);
    }
}