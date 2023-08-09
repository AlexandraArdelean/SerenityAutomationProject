package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps {
    @Step
    public void navigateToRegisterPage() {
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void enterFirstName(String firstName) {
        registerPage.setFirstNameInput(firstName);
    }

    @Step
    public void enterMiddleName(String middleName) {
        registerPage.setMiddleNameInput(middleName);
    }

    @Step
    public void enterLastName(String lastName) {
        registerPage.setLastNameInput(lastName);
    }

    @Step
    public void enterEmailAddress(String email) {
        registerPage.setEmailInput(email);
    }

    @Step
    public void enterPassword(String password) {
        registerPage.setPasswordInput(password);
    }

    @Step
    public void enterConfirmPassword(String password) {
        registerPage.setConfirmPasswordInput(password);
    }

    @Step
    public void signUpForNewsletter() {
        registerPage.setSignUpNewsletterCheckbox();
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegisterButton();
    }

    @Step
    public void verifyUserIsRegistered(String username) {
        // Assert.assertThat(homePage.getWelcomeTextUsername(), Matchers.equalToIgnoringCase(username));
    }
}
