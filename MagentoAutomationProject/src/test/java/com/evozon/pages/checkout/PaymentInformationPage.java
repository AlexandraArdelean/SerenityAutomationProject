package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PaymentInformationPage extends BasePage {

    @FindBy(css = "#payment-buttons-container [type = 'button']")
    private WebElementFacade continuePaymentInformationButton;

    public void clickOnContinueButton() {
        clickOn(continuePaymentInformationButton);
    }
}

