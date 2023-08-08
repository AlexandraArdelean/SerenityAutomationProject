package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class WishlistSteps extends BaseSteps {
    @Step
    public void verifySuccessMessage(String productName) {
        Assert.assertEquals(productName + " has been added to your wishlist. Click here to continue shopping.",
                wishlistPage.getAddToWishListMsgSuccess());
    }

    @Step
    public void updateItemQtyInWishlist(int qty) {
        wishlistPage.setQuantityWishlistField(qty);
        wishlistPage.clickOnUpdateWishlistBtn();
    }
}
