package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class ProductDetailsSteps extends BaseSteps {
    @Step
    public void selectColour(final String colour) {
        this.productDetailsPage.selectColourOption(colour);
    }

    @Step
    public void selectSize(final String size) {
        this.productDetailsPage.selectSizeOption(size);
    }

    @Step
    public void clickAddToCart() {
        this.productDetailsPage.clickAddToCartButton();
    }

    @Step
    public void addToCartCustomisableClothing(final String colour, final String size) {
        this.selectColour(colour);
        this.selectSize(size);
        this.clickAddToCart();
    }

    @Step
    public void selectLinkByTitle(final String title) {
        this.productDetailsPage.selectLinkByTitle(title);
    }
}