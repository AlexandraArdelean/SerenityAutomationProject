package com.evozon.features;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CheckoutTest extends BaseTest {
    @Test
    @Ignore
    public void validCheckoutSimpleProductTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);

        searchSteps.executeSearch(Constants.SIMPLE_PRODUCT);
        productsListSteps.addSimpleProductToCart(Constants.SIMPLE_PRODUCT);
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
