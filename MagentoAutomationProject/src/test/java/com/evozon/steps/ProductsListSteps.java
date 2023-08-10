package com.evozon.steps;


import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class ProductsListSteps extends BaseSteps {
    @Step
    public void addSimpleProductToCart(String productName) {
        productsListPage.addToCartByName(productName);
    }

    @Step
    public void clickOnProductByName(String productName) {
        productsListPage.clickOnProductByName(productName);
    }

    @Step
    public void setSortByPrice() {
        productsListPage.setSortByDropdown("Price");
    }

    @Step
    public void verifySortByPriceAscending() {
        setSortByPrice();
        Assert.assertTrue("Products are sort in ascending order by price!", productsListPage.isSortByPriceAscending());
    }


    @Step
    public void searchAndClickProductByName(String productName) {
        homePage.setSearchText(productName);
        clickOnProductByName(productName);
    }

    @Step
    public void verifyPageTitleIsCorrect(String title) {
        Assert.assertThat(productsListPage.getPageTitleHeadingText(), Matchers.equalToIgnoringCase(title));
    }
}