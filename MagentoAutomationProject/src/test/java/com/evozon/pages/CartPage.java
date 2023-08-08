package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(css = ".success-msg span")
    private WebElementFacade addToCartSuccessMessage;
    @FindBy(css = ".bottom .btn-checkout")
    private WebElementFacade bottomCheckoutButton;

    public String getAddToCartMessage() {
        return addToCartSuccessMessage.getText();
    }

    public void clickBottomCheckoutButton() {
        this.clickOn(this.bottomCheckoutButton);

    }
}
