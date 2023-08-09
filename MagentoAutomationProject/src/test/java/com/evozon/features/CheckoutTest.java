package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {
    @Test
    public void validCheckoutSimpleProductTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        String name = "SimpleTestProduct";

        productsListSteps.searchAProduct(name);
        productsListSteps.addSimpleProductToCart(name);
        cartSteps.clickBottomCheckout();

        checkoutSteps.selectShipToSameAddress();
        checkoutSteps.clickBillingContinue();
        checkoutSteps.selectFreeShippingMethod();
        checkoutSteps.clickShippingMethodContinue();
        checkoutSteps.clickPaymentContinue();
        checkoutSteps.clickReviewContinue();
        orderConfirmationSteps.verifyOrderIsPlaced();
    }

}
