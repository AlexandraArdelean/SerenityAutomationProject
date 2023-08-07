package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(css = ".bottom .btn-checkout")
    private WebElementFacade bottomCheckoutButton;

    public void clickBottomCheckoutButton() {
        this.clickOn(this.bottomCheckoutButton);
    }
}
