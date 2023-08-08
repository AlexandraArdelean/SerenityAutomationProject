package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage {
    @FindBy(className = "sub-title")
    private WebElementFacade confirmationSubtitleTextHeading;

    public String getConfirmationSubtitleTextHeading() {
        return this.waitFor(this.confirmationSubtitleTextHeading).getText();
    }
}
