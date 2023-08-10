package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps{
    @Step
    public void goToLoginPage(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void enterEmailAddress(String email){
        loginPage.setEmailField(email);
    }

    @Step
    public void enterPassword(String pass){
        loginPage.setPassField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();

    }

    @Step
    public void verifyUserIsLoggedIn(String userName){
        Assert.assertTrue(accountLinksPage.isUserLoggedIn(userName));
    }


    @Step
    public void doLogin(String userEmail, String password){
        goToLoginPage();
        enterEmailAddress(userEmail);
        enterPassword(password);
        clickLogin();
    }
}
