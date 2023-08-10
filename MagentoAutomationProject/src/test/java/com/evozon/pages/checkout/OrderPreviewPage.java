package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class OrderPreviewPage extends BasePage {
    @FindBy(css = "#review-buttons-container button")
    private WebElementFacade placeOrderButton;


    public void clickOnPlaceOrderButton() {
        clickOn(placeOrderButton);
    }
}
