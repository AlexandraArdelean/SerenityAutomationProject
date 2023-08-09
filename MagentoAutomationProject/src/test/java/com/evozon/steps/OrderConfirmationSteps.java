package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class OrderConfirmationSteps extends BaseSteps {
    @Step
    public void verifyOrderIsPlaced() {
        Assert.assertThat(orderConfirmationPage.getConfirmationSubtitleTextHeading(), Matchers.equalToIgnoringCase("Thank you for your purchase!"));
    }

}
