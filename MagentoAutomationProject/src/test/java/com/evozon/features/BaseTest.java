package com.evozon.features;

import com.evozon.steps.*;
import com.evozon.utils.Constants;
import com.evozon.utils.Customer;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

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

    @Steps
    protected WishlistSteps wishlistSteps;

    @Steps
    protected AccountSteps accountSteps;

    @Steps
    protected ProductDetailsSteps productDetailsSteps;

    @Steps
    protected AddToCartSteps addToCartSteps;

    @Steps
    protected AccountInformationSteps accountInformationSteps;

    @Steps
    protected AccountNewsletterSteps accountNewsletterSteps;

    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected HomePageSteps homePageSteps;

    @Steps
    protected ProductListAndDetailsStep productListAndDetailsStep;

    @Steps
    protected CheckoutAsGuestSteps checkoutAsGuestSteps;

    Customer customer = new Customer("Ana", "Maria", "Pop", "ASDF", "ana@gmail.com",
            "Asdfg 1/55", "ASFGHT 55/1", "Baia Mare", "Maramureş", "525893",
            "Romania", "1457896529", "45987");

    @Before
    public void init() {
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }
}