package com.evozon.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest {
    @Test
    public void validCheckoutSimpleProductTest() {


        this.checkoutSteps.selectShipToSameAddress();
        this.checkoutSteps.clickBillingContinue();
        this.checkoutSteps.selectFreeShippingMethod();
        this.checkoutSteps.clickShippingMethodContinue();
        this.checkoutSteps.clickPaymentContinue();
        this.checkoutSteps.clickReviewContinue();
    }

}
