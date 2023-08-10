package com.evozon.pages.checkout;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class ShippingMethodPage extends BasePage {
    @FindBy(id = "s_method_flatrate_flatrate")
    private WebElementFacade fixedShippingRadioButton;
    @FindBy(css = "#shipping-method-buttons-container > button > span > span")
    private WebElementFacade continueShippingButton;

    public void clickOnFixedFlatRateButton() {
        withTimeoutOf(Duration.ofSeconds(30)).find(By.id("s_method_flatrate_flatrate")).isEnabled();
        clickOn(fixedShippingRadioButton);
    }

    public void clickContinue() {
        clickOn(continueShippingButton);
    }

}
