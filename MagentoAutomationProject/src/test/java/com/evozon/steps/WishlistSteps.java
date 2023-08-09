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
    public void updateItemQtyInWishlist(String name, int qty) {
        wishlistPage.setQuantityWishlistField(name, qty);
        wishlistPage.clickOnUpdateWishlistBtn();
    }

    @Step
    public void verifyIfQuantityWasUpdated(String name, int qty) {
        Assert.assertEquals(String.valueOf(qty), wishlistPage.getQuantity(name));


    }

    @Step
    public void clickAddToCart() {
        wishlistPage.clickOnAddToCartButton();
    }
}
