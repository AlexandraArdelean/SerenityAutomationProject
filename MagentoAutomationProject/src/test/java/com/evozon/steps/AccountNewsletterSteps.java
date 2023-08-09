package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AccountNewsletterSteps extends BaseSteps {
    @Step
    public void verifyIfNewsletterButtonIsChecked() {
        Assert.assertTrue(accountNewsletterPage.isSubscriptionCheckboxChecked());
    }

    @Step
    public void verifyIfNewsletterButtonIsNotChecked() {
        Assert.assertFalse(accountNewsletterPage.isSubscriptionCheckboxChecked());
    }
}
