package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps {
    @Step
    public void selectShipToDifferentAddress() {
        checkoutPage.setShipDifferentAddressRadioButton();
    }

    @Step
    public void selectShipToSameAddress() {
        checkoutPage.setShipSameAddressRadioButton();
    }

    @Step
    public void clickBillingContinue() {
        checkoutPage.clickBillingContinueButton();
    }

    @Step
    public void clickShippingContinue() {
        checkoutPage.clickShippingContinueButton();
    }

    @Step
    public void selectFreeShippingMethod() {
        checkoutPage.setFreeShippingMethodRadioButton();
    }

    @Step
    public void selectFlatRateShippingMethod() {
        checkoutPage.setFlatRateShippingMethodRadioButton();
    }

    @Step
    public void clickShippingMethodContinue() {
        checkoutPage.clickShippingMethodContinueButton();
    }

    @Step
    public void clickPaymentContinue() {
        checkoutPage.clickPaymentContinueButton();
    }

    @Step
    public void clickReviewContinue() {
        checkoutPage.clickReviewContinueButton();
    }
}
