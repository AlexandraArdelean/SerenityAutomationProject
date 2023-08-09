package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

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
    public void executeSearch(String product) {
        enterTextInSearchBar(product);
        clickOnSearch();
    }

    @Step
    public void verifyIfSearchedProductIsInList(String product) {
        Assert.assertTrue(productsListPage.isProductInList(product));
    }
}
