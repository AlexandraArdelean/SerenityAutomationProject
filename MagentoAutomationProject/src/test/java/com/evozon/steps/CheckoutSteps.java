package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps {
    @Step
    public void selectShipToDifferentAddress() {
        this.checkoutPage.setShipDifferentAddressRadioButton();
    }

    @Step
    public void selectShipToSameAddress() {
        this.checkoutPage.setShipSameAddressRadioButton();
    }

    @Step
    public void clickBillingContinue() {
        this.checkoutPage.clickBillingContinueButton();
    }

    @Step
    public void clickShippingContinue() {
        this.checkoutPage.clickShippingContinueButton();
    }

    @Step
    public void selectFreeShippingMethod() {
        this.checkoutPage.setFreeShippingMethodRadioButton();
    }

    @Step
    public void selectFlatRateShippingMethod() {
        this.checkoutPage.setFlatRateShippingMethodRadioButton();
    }

    @Step
    public void clickShippingMethodContinue() {
        this.checkoutPage.clickShippingMethodContinueButton();
    }

    @Step
    public void clickPaymentContinue() {
        this.checkoutPage.clickPaymentContinueButton();
    }

    @Step
    public void clickReviewContinue() {
        this.checkoutPage.clickReviewContinueButton();
    }
}
