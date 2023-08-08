package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {
    @Step
    public void clickBottomCheckout() {
        this.cartPage.clickBottomCheckoutButton();
    }

    @Step
    public void verifyIsProductAddedToCart(final String productName) {
        Assert.assertEquals(String.format("%s was added to your shopping cart.", productName), cartPage.getAddToCartMessage());
    }
}
