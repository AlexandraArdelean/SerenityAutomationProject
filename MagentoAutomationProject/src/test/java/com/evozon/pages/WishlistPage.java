package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage {
    @FindBy(css = ".success-msg")
    private WebElementFacade addToWishlistSuccessMsg;

    @FindBy(css = "input[name='qty[252]']")
    private WebElementFacade wishlistQtyField;

    @FindBy(css = ".buttons-set  button[title='Update Wishlist']")
    private WebElementFacade updateWishlistQtyBtn;


    public String getAddToWishListMsgSuccess() {
        return addToWishlistSuccessMsg.getText();
    }

    public void setQuantityWishlistField(int qty) {
        wishlistQtyField.clear();
        typeInto(wishlistQtyField, String.valueOf(qty));
    }

    public void clickOnUpdateWishlistBtn() {
        clickOn(updateWishlistQtyBtn);
    }
}
