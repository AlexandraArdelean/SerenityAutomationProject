package com.evozon.pages;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountInformationPage extends BasePage {
    @FindBy(id = "firstname")
    private WebElementFacade firstNameInput;

    @FindBy(id = "middlename")
    private WebElementFacade middleNameInput;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameInput;

    @FindBy(id = "email")
    private WebElementFacade emailInput;

    public String getFirstNameInputText() {
        return firstNameInput.getAttribute("value");
    }

    public String getMiddleNameInputText() {
        return middleNameInput.getAttribute("value");
    }

    public String getLastNameInputText() {
        return lastNameInput.getAttribute("value");
    }

    public String getEmailInputText() {
        return emailInput.getAttribute("value");
    }
}
