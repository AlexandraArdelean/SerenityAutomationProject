package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductsListSteps extends BaseSteps {
    @Step
    public void searchAProduct(final String product) {
        searchProduct(product);
        Assert.assertTrue(productsListPage.isProductInList(product));
    }

    @Step
    public void searchProduct(final String product) {
        homePage.searchForProduct(product);
        homePage.clickOnSearchIcon();
    }

    @Step
    public void addSimpleProductToCart(String productName) {
        productsListPage.addToCartByName(productName);
    }

    @Step
    public void clickOnProductByName(final String productName) {
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
    public void searchAndClickProductByName(final String productName) {
        this.searchProduct(productName);
        this.clickOnProductByName(productName);
    }
}