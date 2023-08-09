package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductsListSteps extends BaseSteps {
    @Step
    public void searchAProduct(String product) {
        searchProduct(product);
        Assert.assertTrue(productsListPage.isProductInList(product));
    }

    @Step
    public void searchProduct(String product) {
        homePage.searchForProduct(product);
        homePage.clickOnSearchIcon();
    }

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
        searchProduct(productName);
        clickOnProductByName(productName);
    }
}