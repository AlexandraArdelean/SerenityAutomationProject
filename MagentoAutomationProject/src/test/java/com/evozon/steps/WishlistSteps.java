package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class WishlistSteps extends BaseSteps {
    @Step
    public void verifySuccessMessage(final String productName) {
        Assert.assertEquals(productName + " has been added to your wishlist. Click here to continue shopping.",
                wishlistPage.getAddToWishListMsgSuccess());
    }
}
