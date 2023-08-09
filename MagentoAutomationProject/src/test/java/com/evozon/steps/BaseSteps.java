package com.evozon.steps;

import com.evozon.pages.*;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseSteps extends ScenarioSteps {
    protected HomePage homePage;
    protected ProductsListPage productsListPage;
    protected LoginPage loginPage;
    protected AccountPage accountPage;
    protected RegisterPage registerPage;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;
    protected OrderConfirmationPage orderConfirmationPage;
    protected WishlistPage wishlistPage;

    protected ProductDetailsPage productDetailsPage;
}
