package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class WishlistTest extends BaseTest {
    @Test
    public void doAddProductToWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        accountSteps.addProductToWishlist("RETRO CHIC EYEGLASSES");
        wishlistSteps.verifySuccessMessage("Retro Chic Eyeglasses");
    }
}
