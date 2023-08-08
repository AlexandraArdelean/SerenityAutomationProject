package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductsListSteps extends BaseSteps {
    @Step
    public void searchAProduct(String product) {
        homePage.searchForProduct(product);
        homePage.clickOnSearchIcon();
        Assert.assertTrue(productsListPage.isProductInList(product));
    }

    @Step
    public void addSimpleProductToCart(String productName) {
        productsListPage.addToCartByName(productName);
    }

    @Step
    public void verifyIsProductAddedToCart() {
        Assert.assertEquals("Swing Time Earrings was added to your shopping cart.", cartPage.getAddToCartMessage());
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

}
