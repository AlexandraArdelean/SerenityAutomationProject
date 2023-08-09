package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountNewsletterPage extends BasePage {
    @FindBy(id = "subscription")
    private WebElementFacade subscriptionCheckbox;

    public boolean isSubscriptionCheckboxChecked() {
        return subscriptionCheckbox.isSelected();
    }
}
