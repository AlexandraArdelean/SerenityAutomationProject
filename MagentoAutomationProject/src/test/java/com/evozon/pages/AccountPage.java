package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {
    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextParagraph;

    @FindBy(xpath = "//a[text()='Account Information']")
    private WebElementFacade accountInformationLink;

    @FindBy(id = "search")
    private WebElement searchBar;
    @FindBy(css = "[title='Search']")
    private WebElement magnifyingGlassButton;

    public void clickAccountInformationLink() {
        clickOn(accountInformationLink);
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

    public void writeTextInSearchBar(String product) {
        typeInto(searchBar, product);
    }

    public void clickOnSearch() {
        clickOn(magnifyingGlassButton);
    }
}