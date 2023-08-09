package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class SearchSteps extends BaseSteps {
    @Step
    public void enterTextInSearchBar(String text) {
        homePage.setSearchText(text);
    }

    @Step
    public void clickOnSearch() {
        homePage.clickOnSearchIcon();
    }


    @Step
    public void searchProduct(String product) {
        homePage.setSearchText(product);
        homePage.clickOnSearchIcon();
    }
}
