package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage {
    @FindBy(css = ".success-msg")
    private WebElementFacade addToWishlistSuccessMsg;
    



    public String getAddToWishListMsgSuccess() {
        return addToWishlistSuccessMsg.getText();
    }
}
