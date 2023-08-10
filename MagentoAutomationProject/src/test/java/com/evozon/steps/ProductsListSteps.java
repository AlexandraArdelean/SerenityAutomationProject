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
    public void setSortByName() {
        productsListPage.setSortByDropdown("Name");
    }

    @Step
    public void changeSortOrder() {
        productsListPage.clickSortOrderLink();
    }

    @Step
    public void verifyIfSortedByPriceAscending() {
        Assert.assertTrue(productsListPage.isSortByPriceAscending());
    }

    @Step
    public void verifyIfSortedByPriceDescending() {
        Assert.assertTrue(productsListPage.isSortByPriceDescending());
    }

    @Step
    public void verifyIfSortedByNameAscending() {
        Assert.assertTrue(productsListPage.isSortByNameAscending());
    }

    @Step
    public void verifyIfSortedByNameDescending() {
        Assert.assertTrue(productsListPage.isSortByNameDescending());
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