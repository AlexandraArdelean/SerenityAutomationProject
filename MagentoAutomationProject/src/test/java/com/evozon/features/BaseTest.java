package com.evozon.features;

import com.evozon.steps.*;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public abstract class BaseTest {

    @Managed(uniqueSession = true)
    protected WebDriver driver;

    @Steps
    protected ProductsListSteps productsListSteps;
    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected RegisterSteps registerSteps;

    @Steps
    protected CheckoutSteps checkoutSteps;

    @Steps
    protected CartSteps cartSteps;

    @Steps
    protected OrderConfirmationSteps orderConfirmationSteps;

    @Before
    public void init() {
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }

}