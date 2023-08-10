package com.evozon.features;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/simple_products.csv")
@Concurrent
public class WishlistTest extends BaseTest {

    private String productName;

    @Test
    public void addTheProductToWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        searchSteps.executeSearch(productName);
        accountSteps.addToWishlist(productName);
        wishlistSteps.verifySuccessMessage(productName);
    }

    @Test
    public void editProductQuantity() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        searchSteps.executeSearch(productName);
        accountSteps.addToWishlist(productName);
        wishlistSteps.updateItemQuantityInWishlist(productName, Constants.WISHLIST_QUANTITY);
        wishlistSteps.verifyIfQuantityWasUpdated(productName, Constants.WISHLIST_QUANTITY);

    }

    @Test
    public void addToCartFromWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        searchSteps.executeSearch(productName);
        accountSteps.addToWishlist(productName);
        wishlistSteps.clickAddToCart();
    }
}
