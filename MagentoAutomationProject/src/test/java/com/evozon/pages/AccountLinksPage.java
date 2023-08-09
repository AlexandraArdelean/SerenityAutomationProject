package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountLinksPage extends BasePage {
    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextParagraph;

    @FindBy(xpath = "//a[text()='Account Information']")
    private WebElementFacade accountInformationLink;

    @FindBy(xpath = "//a[text()='Newsletter Subscriptions']")
    private WebElementFacade newsletterSubscriptionsLink;

    public void clickAccountInformationLink() {
        clickOn(accountInformationLink);
    }

    public void clickNewsletterInformationLink() {
        clickOn(newsletterSubscriptionsLink);
    }

    public void verifyLoggedIn(String userName) {
        welcomeTextParagraph.shouldContainOnlyText("Hello, " + userName + "!");
    }

    public boolean isUserLoggedIn(String userName) {
        return welcomeTextParagraph.containsOnlyText("Hello, " + userName + "!");
    }

    public String getUserLoggedInMessage() {
        return welcomeTextParagraph.getText();
    }


}