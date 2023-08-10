package com.evozon.features;

import com.evozon.utils.Constants;
import com.evozon.utils.Customer;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value = "features/simple_products.csv")
@RunWith(SerenityRunner.class)
public class CheckoutAsGuestTest extends BaseTest {
    private String productName;


    @Test
    public void checkOutAsGuestTest() {
        searchSteps.executeSearch(Constants.SIMPLE_PRODUCT);
        productsListSteps.addSimpleProductToCart(Constants.SIMPLE_PRODUCT);
        cartSteps.clickBottomCheckout();
        checkoutAsGuestSteps.selectCheckoutAsGuest();
        checkoutAsGuestSteps.clickContinueButton();
        checkoutAsGuestSteps.enterFirstName(customer.getFirstName());
        checkoutAsGuestSteps.enterMiddleName(customer.getMiddleName());
        checkoutAsGuestSteps.enterLastName(customer.getLastName());
        checkoutAsGuestSteps.enterCompany(customer.getCompany());
        checkoutAsGuestSteps.enterEmailAddress(customer.getEmailAddress());
        checkoutAsGuestSteps.enterStreetAddress1(customer.getStreetAddress1());
        checkoutAsGuestSteps.enterStreetAddress2(customer.getStreetAddress2());
        checkoutAsGuestSteps.enterCity(customer.getCity());
        checkoutAsGuestSteps.selectCountry(customer.getCountry());
        checkoutAsGuestSteps.selectState(customer.getState());
        checkoutAsGuestSteps.enterPostalCode(customer.getPostalCode());
        checkoutAsGuestSteps.enterTelephone(customer.getTelephone());
        checkoutAsGuestSteps.enterFax(customer.getFax());
        checkoutAsGuestSteps.selectShipToDifferentAddress();
        checkoutAsGuestSteps.clickContinueToShipping();
        checkoutAsGuestSteps.clickUseBillingAddress();
        checkoutAsGuestSteps.selectFixedShippingRate();
        checkoutAsGuestSteps.clickContinueToPayment();
        checkoutAsGuestSteps.clickContinueToOrderReview();
        checkoutAsGuestSteps.clickOnPlaceOrder();


    }
}
