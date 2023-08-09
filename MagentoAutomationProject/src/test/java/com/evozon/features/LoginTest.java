package com.evozon.features;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/login.csv")
public class LoginTest extends BaseTest {
    private String email_address;
    private String password;
    private String username;

    @Test
    public void validLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.enterEmailAddress(email_address);
        loginSteps.enterPassword(password);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(username);
    }
}