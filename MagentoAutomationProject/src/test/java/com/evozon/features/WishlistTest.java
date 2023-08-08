package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class WishlistTest extends BaseTest {
    @Test
    public void doAddProductToWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        accountSteps.addProductToWishlist(Constants.SIMPLE_PRODUCT);
        wishlistSteps.verifySuccessMessage(Constants.SIMPLE_PRODUCT);
    }

    @Test
    public void editProductQty() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        accountSteps.addProductToWishlist(Constants.SIMPLE_PRODUCT);
        wishlistSteps.updateItemQtyInWishlist(5);
    }
}
