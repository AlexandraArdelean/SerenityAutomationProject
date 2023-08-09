package com.evozon.features;

import com.github.javafaker.Faker;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class RegisterTest extends BaseTest {
    private static final Faker faker = new Faker();

    @Test
    public void validMandatoryFieldsRegisterTest() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(6, 20);
        registerSteps.navigateToRegisterPage();
        registerSteps.enterFirstName(firstName);
        registerSteps.enterLastName(lastName);
        registerSteps.enterEmailAddress(email);
        registerSteps.enterPassword(password);
        registerSteps.enterConfirmPassword(password);
        registerSteps.clickRegister();
        accountSteps.goToMyAccount();
        accountSteps.clickAccountInformation();
        accountInformationSteps.verifyIfFirstNameCorrect(firstName);
        accountInformationSteps.verifyIfLastNameCorrect(lastName);
        accountInformationSteps.verifyIfEmailCorrect(email);
        accountSteps.clickNewsletterSubscriptions();
        accountNewsletterSteps.verifyIfNewsletterButtonIsNotChecked();
    }

    @Test
    public void validAllFieldsRegisterTest() {
        String firstName = faker.name().firstName();
        String middleName = faker.name().nameWithMiddle();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(6, 20);
        registerSteps.navigateToRegisterPage();
        registerSteps.enterFirstName(firstName);
        registerSteps.enterMiddleName(middleName);
        registerSteps.enterLastName(lastName);
        registerSteps.enterEmailAddress(email);
        registerSteps.enterPassword(password);
        registerSteps.enterConfirmPassword(password);
        registerSteps.signUpForNewsletter();
        registerSteps.clickRegister();
        accountSteps.goToMyAccount();
        accountSteps.clickAccountInformation();
        accountInformationSteps.verifyIfFirstNameCorrect(firstName);
        accountInformationSteps.verifyIfMiddleNameCorrect(middleName);
        accountInformationSteps.verifyIfLastNameCorrect(lastName);
        accountInformationSteps.verifyIfEmailCorrect(email);
        accountSteps.clickNewsletterSubscriptions();
        accountNewsletterSteps.verifyIfNewsletterButtonIsChecked();
    }
}
