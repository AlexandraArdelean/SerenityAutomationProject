package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "a[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(className = "welcome-msg")
    private WebElementFacade welcomeTextParagraph;

    public void clickAccountLink() {
        this.clickOn(this.accountLink);
    }

    public void clickLoginLink() {
        this.clickOn(this.loginLink);
    }

    public void clickRegisterLink() {
        this.clickOn(this.registerLink);
    }

    public String getWelcomeTextUsername() {
        return this.welcomeTextParagraph.getText()
                .replaceAll("WELCOME, ", "")
                .replaceAll("!", "");
    }
}
