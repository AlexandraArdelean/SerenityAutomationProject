package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AccountInformationSteps extends BaseSteps {
    @Step
    public void verifyIfFirstNameCorrect(String firstName) {
        Assert.assertEquals(firstName, accountInformationPage.getFirstNameInputText());
    }

    @Step
    public void verifyIfMiddleNameCorrect(String middleName) {
        Assert.assertEquals(middleName, accountInformationPage.getMiddleNameInputText());
    }

    @Step
    public void verifyIfLastNameCorrect(String lastName) {
        Assert.assertEquals(lastName, accountInformationPage.getLastNameInputText());
    }

    @Step
    public void verifyIfEmailCorrect(String email) {
        Assert.assertEquals(email, accountInformationPage.getEmailInputText());
    }
}
