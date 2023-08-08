package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class WishlistSteps extends BaseSteps {
    @Step
    public void verifySuccessMessage() {
        Assert.assertEquals("Retro Chic Eyeglasses has been added to your wishlist. Click here to continue shopping.",
                wishlistPage.getAddToWishListMsgSuccess());
    }
}
