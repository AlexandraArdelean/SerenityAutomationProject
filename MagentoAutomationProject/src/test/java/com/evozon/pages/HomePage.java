package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(css = "a.level0")
    private List<WebElementFacade> categoryLinks;

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

    private WebElementFacade findCategoryLinkByName(String categoryName) {
        return categoryLinks.stream()
                .filter(el -> categoryName.equalsIgnoreCase(el.getText()))
                .findFirst()
                .orElse(null);
    }

    private  WebElementFacade findSubcategoryLinkByCategoryAndName(String categoryName, String subcategoryName) {
        return findCategoryLinkByName(categoryName).thenFindAll(By.cssSelector("a.level1"))
                .stream()
                .filter(el -> subcategoryName.equalsIgnoreCase(el.getText()))
                .findFirst()
                .orElse(null);
    }

    public void clickCategoryLinkByName(String categoryName) {
        withAction().moveToElement(findCategoryLinkByName(categoryName)).perform();
    }

    public void clickSubcategoryLinkByCategoryAndName(String categoryName, String subcategoryName) {
        findSubcategoryLinkByCategoryAndName(categoryName, subcategoryName).click();
    }


    public String getWelcomeTextUsername() {
        return welcomeTextParagraph.getText()
                .replaceAll("WELCOME, ", "")
                .replaceAll("!", "");
    }
}
