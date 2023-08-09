package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(id = "firstname")
    private WebElementFacade firstNameInput;

    @FindBy(id = "middlename")
    private WebElementFacade middleNameInput;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameInput;

    @FindBy(id = "email_address")
    private WebElementFacade emailInput;

    @FindBy(id = "password")
    private WebElementFacade passwordInput;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmPasswordInput;

    @FindBy(id = "is_subscribed")
    private WebElementFacade signUpNewsletterCheckbox;

    @FindBy(css = "button[title=Register] span span")
    private WebElementFacade registerButton;

    public void setFirstNameInput(String firstName) {
        typeInto(firstNameInput, firstName);
    }

    public void setMiddleNameInput(String middleName) {
        typeInto(middleNameInput, middleName);
    }

    public void setLastNameInput(String lastName) {
        typeInto(lastNameInput, lastName);
    }

    public void setEmailInput(String email) {
        typeInto(emailInput, email);
    }

    public void setPasswordInput(String password) {
        typeInto(passwordInput, password);
    }

    public void setConfirmPasswordInput(String password) {
        typeInto(confirmPasswordInput, password);
    }

    public void setSignUpNewsletterCheckbox() {
        clickOn(signUpNewsletterCheckbox);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

}
