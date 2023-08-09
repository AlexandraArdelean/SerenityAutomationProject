package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = ".skip-content a[title='My Account']")
    private WebElementFacade myAccountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "a[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(id = "search")
    private WebElementFacade searchBar;
    @FindBy(css = ".input-box [title='Search']")
    private WebElementFacade magnifyingGlassIcon;
    @FindBy(className = "welcome-msg")
    private WebElementFacade welcomeTextParagraph;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickMyAccountLink() {
        clickOn(myAccountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void clickRegisterLink() {
        clickOn(registerLink);
    }

    public void searchForProduct(String productName) {
        typeInto(searchBar, productName);
    }

    public void clickOnSearchIcon() {
        clickOn(magnifyingGlassIcon);
    }


    public String getWelcomeTextUsername() {
        return welcomeTextParagraph.getText()
                .replaceAll("WELCOME, ", "")
                .replaceAll("!", "");
    }
}
