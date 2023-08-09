package com.evozon.features;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/simple_products.csv")
public class WishlistTest extends BaseTest {

    private String product_name;
    @Test
    public void addTheProductToWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        accountSteps.addToWishlist(product_name);
        wishlistSteps.verifySuccessMessage(product_name);
    }

    @Test
    public void editProductQty() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        accountSteps.addToWishlist(product_name);
        wishlistSteps.updateItemQtyInWishlist(product_name, 5);
        wishlistSteps.verifyIfQuantityWasUpdated("5", product_name);

    }

    @Test
    public void addToCartFromWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        accountSteps.addToWishlist(product_name);
        wishlistSteps.clickAddToCart();
    }
}
