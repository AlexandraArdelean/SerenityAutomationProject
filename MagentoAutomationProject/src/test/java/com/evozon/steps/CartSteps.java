package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class CartSteps extends BaseSteps {
    @Step
    public void clickBottomCheckout() {
        this.cartPage.clickBottomCheckoutButton();
    }

}
