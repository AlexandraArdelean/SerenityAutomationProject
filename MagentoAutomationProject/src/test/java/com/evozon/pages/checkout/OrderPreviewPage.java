package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class OrderPreviewPage extends BasePage {
    @FindBy(css = "#review-buttons-container button")
    private WebElementFacade placeOrderButton;


    public void clickOnPlaceOrderButton() {
        withTimeoutOf(Duration.ofSeconds(100)).waitFor(placeOrderButton).click();
//        clickOn(placeOrderButton);
    }
}
