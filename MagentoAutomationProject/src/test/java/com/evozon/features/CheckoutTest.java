package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {
    @Test
    public void validCheckoutSimpleProductTest() {
        this.loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        final String name = "SimpleTestProduct";

        this.productsListSteps.searchAProduct(name);
        this.productsListSteps.addSimpleProductToCart(name);
        this.cartSteps.clickBottomCheckout();

        this.checkoutSteps.selectShipToSameAddress();
        this.checkoutSteps.clickBillingContinue();
        this.checkoutSteps.selectFreeShippingMethod();
        this.checkoutSteps.clickShippingMethodContinue();
        this.checkoutSteps.clickPaymentContinue();
        this.checkoutSteps.clickReviewContinue();
        this.orderConfirmationSteps.verifyOrderIsPlaced();
    }

}
