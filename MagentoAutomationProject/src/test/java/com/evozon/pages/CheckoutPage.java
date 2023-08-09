package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(id = "billing:use_for_shipping_no")
    private WebElementFacade shipDifferentAddressRadioButton;

    @FindBy(id = "billing:use_for_shipping_yes")
    private WebElementFacade shipSameAddressRadioButton;

    @FindBy(css = "#billing-buttons-container button")
    private WebElementFacade billingContinueButton;

    @FindBy(css = "#shipping-buttons-container button")
    private WebElementFacade shippingContinueButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingMethodRadioButton;

    @FindBy(id = "s_method_flatrate_flatrate")
    private WebElementFacade flatRateShippingMethodRadioButton;

    @FindBy(css = "#shipping-method-buttons-container button")
    private WebElementFacade shippingMethodContinueButton;

    @FindBy(css = "#payment-buttons-container button")
    private WebElementFacade paymentContinueButton;

    @FindBy(css = "#review-buttons-container button")
    private WebElementFacade reviewContinueButton;

    public void setShipSameAddressRadioButton() {
        clickOn(shipSameAddressRadioButton);
    }

    public void setShipDifferentAddressRadioButton() {
        clickOn(shipDifferentAddressRadioButton);
    }

    public void clickBillingContinueButton() {
        clickOn(billingContinueButton);
    }

    public void clickShippingContinueButton() {
        clickOn(shippingContinueButton);
    }

    public void setFreeShippingMethodRadioButton() {
        clickOn(freeShippingMethodRadioButton);
    }

    public void setFlatRateShippingMethodRadioButton() {
        clickOn(flatRateShippingMethodRadioButton);
    }

    public void clickShippingMethodContinueButton() {
        clickOn(shippingMethodContinueButton);
    }

    public void clickPaymentContinueButton() {
        clickOn(paymentContinueButton);
    }

    public void clickReviewContinueButton() {
        clickOn(reviewContinueButton);
    }
}
