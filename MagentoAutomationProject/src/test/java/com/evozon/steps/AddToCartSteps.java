package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class AddToCartSteps extends BaseSteps {
    @Step
    public void addSimpleProductToCart(String productName) {
        productsListPage.addToCartByName(productName);
    }
}
