package com.evozon.features;

import com.github.javafaker.Faker;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class RegisterTest extends BaseTest {
    @Test
    public void validRegisterTest() {
        Faker faker = new Faker();
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
        registerSteps.verifyUserIsRegistered(String.format("%s %s %s", firstName, middleName, lastName));
        accountSteps.goToMyAccount();
        accountSteps.clickAccountInformation();
        accountInformationSteps.verifyIfFirstNameCorrect(firstName);
        accountInformationSteps.verifyIfMiddleNameCorrect(middleName);
        accountInformationSteps.verifyIfLastNameCorrect(lastName);
        accountInformationSteps.verifyIfEmailCorrect(email);

    }
}
